package cn.et.model;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbUtils {
	public static Connection getConnection() throws Exception {
		String url="jdbc:mysql://localhost:3306/adb?charset=utf8";
		String driverClass="com.mysql.jdbc.Driver";
		String userName="root";
		String password="123456";
		Class.forName(driverClass);
		return DriverManager.getConnection(url, userName, password);
	}
	
}
