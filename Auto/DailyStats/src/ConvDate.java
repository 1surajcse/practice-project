//package stats;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class ConvDate {

	private static String JDBC_DRIVER;
	private static String DATABASE_URL;
	private static String QUERY;
	private static String LOGIN;
	private static String PASSWORD;
	int sumInfo;
	public String ver;
	ResultSet resultSet;

	public void sqlConnect(ConvDate ob) {

		JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";
		DATABASE_URL = "jdbc:oracle:thin:@192.168.84.20:1521/repalda";
		QUERY = "select param_value,row_last_updated from sum_info_param_value where sum_info_id=" + ob.getSumInfo()
				+ " and SUM_INFO_PARAM_KEY_ID in (18,37) ";
		LOGIN = "read";
		PASSWORD = "read";
	}

	public static void main(String[] args)
			throws NumberFormatException, FileNotFoundException, IOException, ParseException {

		ConvDate ob = new ConvDate();
		for (int i = 0; i < ob.getSizeOfFile(); i++) {
			ob.setSumInfo(ob.sumInfo, i);
			ob.sqlConnect(ob);
			ob.sqlExecute();
			if (ob.ver.equals("Jdap")) {
				System.out.println(ob.formattedDate());
			}
		}

	}

	public void sqlExecute() throws ParseException {
		/*
		 * SimpleDateFormat sdf; sdf = new SimpleDateFormat("dd/MM/yyyy");
		 * String strDate="24/05/2016"; java.util.Date
		 * endDate=sdf.parse(strDate); System.out.println(sdf.format(endDate));
		 */

		/*
		 * java.sql.Date st = new java.sql.Date(endDate.getTime());
		 * System.out.println(st);
		 */

		Connection connection = null;
		PreparedStatement statement = null;
		try {
			System.out.println(JDBC_DRIVER + "\n" + DATABASE_URL + "\n" + QUERY + "\n" + LOGIN + "\n" + PASSWORD);
			Class.forName(JDBC_DRIVER);
			connection = DriverManager.getConnection(DATABASE_URL, LOGIN, PASSWORD);
			statement = connection.prepareStatement(QUERY);
			resultSet = statement.executeQuery();
			ResultSetMetaData metaData = resultSet.getMetaData();
			int numberOfColumns = metaData.getColumnCount();
			System.out.println("Data:");

			for (int i = 1; i <= numberOfColumns; i++)
				System.out.printf("%-8s\t", metaData.getColumnName(i));
			System.out.println();
			while (resultSet.next()) {
				for (int i = 1; i <= numberOfColumns; i++) {
					System.out.printf("%-8s\t", resultSet.getObject(i));
				}
				param_Value.add(resultSet.getString("PARAM_VALUE"));
				row_Last_Updated.add(resultSet.getString("ROW_LAST_UPDATED"));
				System.out.println();
			}
			setPlatformVersion(param_Value, ver);
			setDateOfConversion(row_Last_Updated, date2);
		} catch (SQLException sqlException) {
			sqlException.printStackTrace();
			System.exit(1);
		} catch (ClassNotFoundException classNotFound) {
			classNotFound.printStackTrace();
			System.exit(1);
		} finally {
			try {
				statement.close();
				connection.close();
			} catch (Exception exception) {
				exception.printStackTrace();
				System.exit(1);
			}
		}
	}

	public void setSumInfo(int sumInfo, int i) throws NumberFormatException, FileNotFoundException, IOException {
		this.sumInfo = Integer.parseInt(readInput().get(i));
	}

	public int getSumInfo() {
		return sumInfo;
	}

	public static List<String> readInput() throws FileNotFoundException, IOException {
		List<String> ls = new ArrayList<String>();
		try {
			Scanner input = new Scanner("C:\\Users\\stiwari\\Desktop\\suminfo.txt");
			File file = new File(input.nextLine());
			input = new Scanner(file);
			while (input.hasNextLine()) {
				String line = input.nextLine();
				ls.add(line);
			}
			input.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return ls;
	}

	public int getSizeOfFile() throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\stiwari\\Desktop\\suminfo.txt"));
		int lines = 0;
		while (reader.readLine() != null)
			lines++;
		reader.close();
		return lines;

	}

	private List<String> param_Value = new ArrayList<String>();

	public List<String> getParam_Value() {
		return param_Value;
	}

	public void setParam_Value(List<String> param_Value) {
		this.param_Value = param_Value;
	}

	public List<String> getRow_Last_Updated() {
		return row_Last_Updated;
	}

	public void setRow_Last_Updated(List<String> row_Last_Updated) {
		this.row_Last_Updated = row_Last_Updated;
	}

	private List<String> row_Last_Updated = new ArrayList<String>();

	public void setPlatformVersion(List<String> arr, String ver) {

		if (arr.contains("java") && arr.contains("DAP_PROD")) {
			System.out.println("Jdap");
			this.ver = "Jdap";
		} else if (arr.contains("DAP_PROD")) {
			System.out.println("Dap");
			this.ver = "Dap";
		} else {
			System.out.println("Windows");
			this.ver = "Windows";
		}
	}

	public String getPlatformVersion() {
		return ver;
	}

	public void setDateOfConversion(List<String> arr, String date2) throws ParseException {

		this.date2 = arr.get(1);

	}

	private String date2;

	public String getDateOfConversion() {
		return date2;
	}

	public Date formattedDate() throws ParseException {
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.s");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd-MM-yyyy");
		
		Date finalDate1 = sdf2.parse(getDateOfConversion().substring(0,getDateOfConversion().indexOf(" ")));
		// String finalDate=sdf2.format(finalDate1);
		return finalDate1;

	}

}

