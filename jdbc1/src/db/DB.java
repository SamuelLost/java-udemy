package db;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DB {

	private static Connection conn = null;

	public static Connection getConnection() {
		if (conn == null) {
			try {
				Properties ps = loadProperties();
				String url = ps.getProperty("dburl");

				conn = DriverManager.getConnection(url, ps);
			} catch (SQLException e) {
				throw new DbExeception(e.getMessage());
			}
		}
		return conn;
	}

	public static void closeConnection() {
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				throw new DbExeception(e.getMessage());
			}
		}
	}

	private static Properties loadProperties() {
		try (FileInputStream fs = new FileInputStream("db.properties")) {
			Properties ps = new Properties();
			ps.load(fs);
			return ps;
		} catch (IOException e) {
			throw new DbExeception(e.getMessage());
		}
	}
}
