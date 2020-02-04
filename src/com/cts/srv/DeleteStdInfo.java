package com.cts.srv;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import com.DB.JDBCSingleton;

public class DeleteStdInfo extends GenericServlet {

	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		JDBCSingleton jDBCSingleton = JDBCSingleton.getJDBCInstant();
		System.out.println("<--------jDBCSingleton------>"+jDBCSingleton);
		try {
			Connection con = jDBCSingleton.getConnection();
			Statement stmt = con.createStatement();
			String sql = "delete from std_tb where sid='"+req.getParameter("sid")+"'";
			System.out.println(sql);
			stmt.executeQuery(sql);
			
			System.out.println("Data is inserted -----");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		


	}

}
