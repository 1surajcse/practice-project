//package stats;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QueryFeed {
	private static String JDBC_DRIVER;
	private static String DATABASE_URL;
	private static String QUERY;
	private static String LOGIN;
	private static String PASSWORD;
	int sumInfo;
	public String ver;
	ResultSet resultSet;

	public void sqlConnect(QueryFeed ob) throws ParseException {

		JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";
		DATABASE_URL = "jdbc:oracle:thin:@192.168.84.20:1521/sitep";
		QUERY = "select sum(sss.num_errors*AVG_SCRIPT_LATENCY)/sum(sss.num_errors) as avg_latency, sum(num_errors) as total_request, sum(decode(sss.TYPE_OF_ERROR, 0,num_errors,0)) as success, sum(decode(sss.TYPE_OF_ERROR, 403,num_errors,408,num_errors,413,num_errors,419,num_errors,601,num_errors,708,num_errors,709,num_errors,0)) as agent_errors, sum(decode(sss.TYPE_OF_ERROR, 401,num_errors, 409,num_errors,410,num_errors,411,num_errors,412,num_errors,415,num_errors,418,num_errors,423,num_errors,424,num_errors,425,num_errors,426,num_errors,431,num_errors,432,num_errors,0)) as site_errors, sum(decode(sss.TYPE_OF_ERROR, 402,num_errors,405,num_errors,406,num_errors,407,num_errors,414,num_errors,416,num_errors,420,num_errors,421,num_errors,422,num_errors,427,num_errors,428,num_errors,429,num_errors,518,num_errors,522,num_errors,523,num_errors,525,num_errors,0)) as uar_errors,sum_info_id from site_stats_suminfo sss where sss.sum_info_id = "
				+ ob.getSumInfo() + " and timestamp >= (sysdate-1) group by sum_info_id order by sum_info_id";

		LOGIN = "read";
		PASSWORD = "read";
	}

	public static void main(String[] args)
			throws NumberFormatException, FileNotFoundException, IOException, ParseException {

		QueryFeed ob = new QueryFeed();
		ob.setSumInfo(22292, 0);
		ob.sqlConnect(ob);
		ob.sqlExecute();

	}

	public void sqlExecute() throws ParseException {

		Connection connection = null;
		Statement statement = null;
		new SimpleDateFormat("dd/MM/yyyy");
		try {
			System.out.println(JDBC_DRIVER + "\n" + DATABASE_URL + "\n" + QUERY + "\n" + LOGIN + "\n" + PASSWORD);
			Class.forName(JDBC_DRIVER);
			connection = DriverManager.getConnection(DATABASE_URL, LOGIN, PASSWORD);
			statement = connection.createStatement();
			resultSet = statement.executeQuery(QUERY);
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
				avgLatency.add(RoundTo2Decimals(resultSet.getDouble("AVG_LATENCY") / 1000));
				totalReq.add(resultSet.getDouble("TOTAL_REQUEST"));
				success.add(resultSet.getDouble("SUCCESS"));
				agentErrors.add(resultSet.getDouble("AGENT_ERRORS"));
				siteErrors.add(resultSet.getInt("SITE_ERRORS"));
				uarErrors.add(resultSet.getInt("UAR_ERRORS"));
			}

			for (int i = 0; i < totalReq.size(); i++) {
				agent_err_per.add(RoundTo2Decimals((getAgentErrors().get(i) / getTotalReq().get(i)) * 100.00));
				success_per.add(RoundTo2Decimals((getSuccess().get(i) / getTotalReq().get(i)) * 100.00));
			}
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

	public int getSumInfo() {
		return sumInfo;
	}

	public static Double RoundTo2Decimals(Double val) {
		DecimalFormat df2 = new DecimalFormat("###.##");
		return Double.valueOf(df2.format(val));
	}

	private List<Double> avgLatency = new ArrayList<Double>();

	public List<Double> getAvgLatency() {

		return avgLatency;
	}

	public void setAvgLatency(List<Double> avgLatency) {

		this.avgLatency = avgLatency;
	}

	public List<Double> getTotalReq() {

		return totalReq;
	}

	public void setTotalReq(List<Double> totalReq) {
		this.totalReq = totalReq;
	}

	public List<Double> getSuccess() {
		return success;
	}

	public void setSuccess(List<Double> success) {
		this.success = success;
	}

	public List<Double> getAgentErrors() {
		return agentErrors;
	}

	public void setAgentErrors(List<Double> agentErrors) {
		this.agentErrors = agentErrors;
	}

	public List<Integer> getSiteErrors() {
		return siteErrors;
	}

	public void setSiteErrors(List<Integer> siteErrors) {
		this.siteErrors = siteErrors;
	}

	public List<Integer> getUarErrors() {
		return uarErrors;
	}

	public void setUarErrors(List<Integer> uarErrors) {
		this.uarErrors = uarErrors;
	}

	public List<String> getDate() {
		return date;
	}

	public void setDate(List<String> date) {
		this.date = date;
	}

	public void setSumInfo(int sumInfo, int i) throws NumberFormatException, FileNotFoundException, IOException {
		this.sumInfo = Integer.parseInt(readInput().get(i));
	}

	private List<Double> totalReq = new ArrayList<Double>();
	private List<Double> success = new ArrayList<Double>();
	private List<Double> agentErrors = new ArrayList<Double>();
	private List<Integer> siteErrors = new ArrayList<Integer>();
	private List<Integer> uarErrors = new ArrayList<Integer>();
	private List<String> date = new ArrayList<String>();
	private List<String> columnNames = new ArrayList<String>();

	public List<Double> getSuccess_per() {
		return success_per;
	}

	public void setSuccess_per(List<Double> success_per) {
		this.success_per = success_per;
	}

	public List<Double> getAgent_err_per() {
		return agent_err_per;
	}

	public void setAgent_err_per(List<Double> agent_err_per) {
		this.agent_err_per = agent_err_per;
	}

	private List<Double> success_per = new ArrayList<Double>();
	private List<Double> agent_err_per = new ArrayList<Double>();

	public List<String> getColumnNames() {
		return columnNames;
	}

	public void setColumnNames(List<String> columnNames) {
		this.columnNames = columnNames;
	}

	@SuppressWarnings("resource")
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

}