//package stats;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AgentNamePrgm {
	private static String JDBC_DRIVER;
	private static String DATABASE_URL;
	private static String QUERY;
	private String class_name;
	private static String LOGIN;
	private static String PASSWORD;
	
	private int sumInfo;
	public String ver;

	public AgentNamePrgm(int sumInfo) {
		this.sumInfo = sumInfo;
	}

	public void jdbcSetup() {
		JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";
		DATABASE_URL = "jdbc:oracle:thin:@192.168.84.20:1521/repalda";
		QUERY = "select class_name from sum_info where sum_info_id = " + getSumInfo();
		LOGIN = "read";
		PASSWORD = "read";

	}

	public static void main(String args[]) throws IOException {
		QueryFeed ab = new QueryFeed();
		for (int i = 0; i < 2; i++) {
			ab.setSumInfo(ab.sumInfo, i);
			AgentNamePrgm ob = new AgentNamePrgm(ab.getSumInfo());
			ob.classNameQuery();
			System.out.println(ob.getClassName());
		}

	}

	public void classNameQuery() {
		int i = 0;
		jdbcSetup();
		// System.out.println(JDBC_DRIVER + "\n" + DATABASE_URL + "\n" + QUERY +
		// "\n" + LOGIN + "\n" + PASSWORD);

		Connection connection = null;
		Statement statement = null;
		try {
			Class.forName(JDBC_DRIVER);
			connection = DriverManager.getConnection(DATABASE_URL, LOGIN, PASSWORD);
			statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(QUERY);
			ResultSetMetaData metaData = resultSet.getMetaData();
			metaData.getColumnCount();
			List<String> arr = new ArrayList<String>();
			// System.out.println("Data:");
			new ArrayList<ResultSet>();
			while (resultSet.next()) {
				arr.add(resultSet.getObject(1).toString());
				// System.out.printf("%-8s\t", resultSet.getObject(1));
			}

			setClassName(arr);
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

	public void setClassName(List<String> arr) {
		this.class_name = arr.get(0);
	}

	public String getClassName() {
		return class_name;
	}

	public void setSumInfo(int sumInfo) {
		this.sumInfo = sumInfo;
	}

	public int getSumInfo() {
		return sumInfo;
	}

}
