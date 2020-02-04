package com.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCSingleton {
	static JDBCSingleton jDBCSingleton = null;

	private JDBCSingleton() {

	}

	public static JDBCSingleton getJDBCInstant() {
		if (jDBCSingleton == null) {
			jDBCSingleton = new JDBCSingleton();
		}
		return jDBCSingleton;
	}
public Connection getConnection() throws ClassNotFoundException, SQLException {
	Connection con = null;
	Class.forName("oracle.jdbc.driver.OracleDriver");
	con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "system");
	return con;
}	
}
 