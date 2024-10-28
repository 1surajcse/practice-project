//package stats;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ReadExcelFile {
	List<Double> success_per = new ArrayList<Double>();

	public List<Double> getSuccess_per() {
		return success_per;
	}

	public void setSuccess_per(List<Double> success_per) {
		this.success_per = success_per;
	}

	public List<Double> getAgent_per() {
		return agent_per;
	}

	public void setAgent_per(List<Double> agent_per) {
		this.agent_per = agent_per;
	}

	public List<Double> getLatency() {
		return latency;
	}

	public void setLatency(List<Double> latency) {
		this.latency = latency;
	}

	List<Double> agent_per = new ArrayList<Double>();
	List<Double> latency = new ArrayList<Double>();
	// import statements

	public static void main(String[] args) {
		ReadExcelFile ob = new ReadExcelFile();
		ob.readFile();
		System.out.println(ob.getSuccess_per().get(0));
		System.out.println(ob.getAgent_per());
		System.out.println(ob.getLatency());
	}

	public void readFile() {
		try {
			FileInputStream file = new FileInputStream(
					new File("C:\\Users\\stiwari\\Desktop\\SuccessStats11.xlsx"));
			XSSFWorkbook workbook = new XSSFWorkbook("C:\\Users\\stiwari\\Desktop\\SuccessStats11.xlsx");
			Sheet sheet = workbook.getSheetAt(0);
			Iterator<Row> rowIterator = sheet.iterator();
			while (rowIterator.hasNext()) {

				Row row = rowIterator.next();
				Iterator<Cell> cellIterator = row.cellIterator();
				int i = 0;
				while (cellIterator.hasNext()) {

					Cell cell = cellIterator.next();
					if (cell.getCellType() == Cell.CELL_TYPE_NUMERIC) {
						if (i == 0) {
							success_per.add(cell.getNumericCellValue());
							i++;
						} else if (i == 1) {
							agent_per.add(cell.getNumericCellValue());
							i++;
						} else if (i == 2) {
							latency.add(cell.getNumericCellValue());
						}
					}
				}

				System.out.println("");
			}
			file.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
