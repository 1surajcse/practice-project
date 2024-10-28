//package stats;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WriteToExcelTen {
	private static final String FILE_PATH = "C:\\Users\\stiwari\\Desktop\\SuccessStats11.xlsx";
	private static final WriteToExcelTen INSTANCE = new WriteToExcelTen();

	public static WriteToExcelTen getInstance() {
		return INSTANCE;
	}

	private WriteToExcelTen() {
	}

	public static void main(String args[])
			throws NumberFormatException, FileNotFoundException, IOException, ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		String date1 = sdf.format(date);
		WriteToExcelTen wte = new WriteToExcelTen();
		List<String> coulumnList = new ArrayList<String>();
		coulumnList.add("Success %");
		coulumnList.add("Agent error %");
		coulumnList.add("Latency");
		wte.writecoulumnListToExcel(coulumnList);
		List<Data> DataList = new ArrayList<Data>();
		QueryFeedTenDays ob1 = new QueryFeedTenDays();
		for (int i = 0; i < ob1.getSizeOfFile(); i++) {
			QueryFeedTenDays ob = new QueryFeedTenDays();
			QueryFeedTenDays ob3 = new QueryFeedTenDays();
			ConvDate conDate = new ConvDate();
			ob.setSumInfo(ob.sumInfo, i);
			AgentNamePrgm anp = new AgentNamePrgm(ob.getSumInfo());
			conDate.setSumInfo(ob.sumInfo, i);
			conDate.sqlConnect(conDate);
			conDate.sqlExecute();
			ob.sqlConnect(ob);
			ob3.setSumInfo(ob.sumInfo, i);
			ob3.sqlConnect(ob3);
			ob3.sqlExecute(date);
			ob.sqlExecute(conDate.formattedDate());
			anp.jdbcSetup();
			anp.classNameQuery();
			try {
				DataList.add(new Data(date1, anp.getClassName(), ob.getAvgLatency().get(0), ob.getTotalReq().get(0),
						ob.getSuccess().get(0), ob.getAgentErrors().get(0), ob.getSiteErrors().get(0),
						ob.getUarErrors().get(0), ob.getSuccess_per().get(0), ob.getAgent_err_per().get(0)));
			} catch (IndexOutOfBoundsException ioobe) {
				DataList.add(new Data(date1, anp.getClassName(), 0.00, 0.00, 0.00, 0.00, 0, 0, 0.00, 0.00));
			}catch (NumberFormatException noo)
			{
				DataList.add(new Data(date1, anp.getClassName(), 0.00, 0.00, 0.00, 0.00, 0, 0, 0.00, 0.00));
			}
			wte.writeDataListToExcel(DataList);
		}

		wte.closeExcel();
	}

	Workbook workbook = new XSSFWorkbook();

	Sheet dataSheet = workbook.createSheet("Data");

	public void writecoulumnListToExcel(List<String> columnList) {
		int rowIndex = 0;
		Row row = dataSheet.createRow(rowIndex++);
		int cellIndex = 0;
		for (int i = 0; i < columnList.size(); i++) {

			row.createCell(cellIndex++).setCellValue(columnList.get(i));
		}

	}

	public void writeDataListToExcel(List<Data> DataList) {

		int rowIndex = 1;
		for (Data data : DataList) {
			Row row = dataSheet.createRow(rowIndex++);
			row.createCell(0).setCellValue(data.getSuccess_percentage());
			row.createCell(1).setCellValue(data.getAgent_error_percentage());
			row.createCell(2).setCellValue(data.getAvgLatency());
		}
	}

	public void closeExcel() {

		try {
			FileOutputStream fos = new FileOutputStream(FILE_PATH);
			workbook.write(fos);
			fos.close();

			System.out.println(FILE_PATH + " is successfully written");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
