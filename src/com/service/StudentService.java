package com.service;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collections;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import com.Bean.StudentBean;
import com.DB.JDBCSingleton;

public class StudentService {
public static void insertStdInfo(StudentBean studentBean) {
	System.out.println("<--------insertStdInfo------>");
	JDBCSingleton jDBCSingleton = JDBCSingleton.getJDBCInstant();
	System.out.println("<--------jDBCSingleton------>"+jDBCSingleton);
	try {
		Connection con = jDBCSingleton.getConnection();
		Statement stmt = con.createStatement();
		//PreparedStatement stmt=con.prepareStatement("insert into Std_TB123 (SID ,Sname,Sadd,SDept) values(?,?,?,?)"); 
		//String sql = "INSERT INTO Std_TB123 (SID ,Sname,Sadd,SDept,S_Phone_Number) VALUES ('"+studentBean.getsId()+"','"+studentBean.getsName()+"','"+studentBean.getsAdd()+"','"+studentBean.getsDept()+"','"+studentBean.getsPhone_Number()+"')";
		String sql = "INSERT INTO Std_TB (SID ,Sname,Sadd,SDept,S_Phone_Number) VALUES ('"+studentBean.getsId()+"','"+studentBean.getsName()+"','"+studentBean.getsAdd()+"','"+studentBean.getsDept()+"','"+studentBean.getsPhone_Number()+"')";
		System.out.println(sql);
		stmt.execute(sql);
		System.out.println("Data is inserted -----");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}

public static void getStdInfo(ServletRequest req, ServletResponse res) throws IOException {

	System.out.println("<--------getStdInfo123------>");
	JDBCSingleton jDBCSingleton = JDBCSingleton.getJDBCInstant();
	System.out.println("<--------jDBCSingleton------>"+jDBCSingleton);
	try {
		Connection con = jDBCSingleton.getConnection();
		Statement stmt = con.createStatement();
		//PreparedStatement stmt=con.prepareStatement("insert into Std_TB123 (SID ,Sname,Sadd,SDept) values(?,?,?,?)"); 
		//String sql = "INSERT INTO Std_TB123 (SID ,Sname,Sadd,SDept,S_Phone_Number) VALUES ('"+studentBean.getsId()+"','"+studentBean.getsName()+"','"+studentBean.getsAdd()+"','"+studentBean.getsDept()+"','"+studentBean.getsPhone_Number()+"')";
		//String sql = "select * from std_tb where sid='1'";
		//String sql = "select * from std_tb where sid='"+req.getParameter("sid")+"'";
		String sql = "select * from std_tb";
		System.out.println(sql);
		ResultSet rs = stmt.executeQuery(sql);
		PrintWriter pw = res.getWriter();
		System.out.println("Data is inserted -----");
		pw.print("<table border=1><tr><th>ID</th><th>SNAME</th><th>SADDRESS</th><th>SDEPT</th><th>SPHONE_NUMBER</th></tr>");
		while (rs.next()) {
		if(rs.getString(1) != null){
			System.out.println("SID-->"+rs.getString(1)+"<-----SNAME-->"+rs.getString(2)+"<-----SADD-->"+rs.getString(3)+"<-----SDEPT-->"+rs.getString(4)+"<-----SPHONE_NUMBER-->"+rs.getString(5));
			//pw.print("SID-->"+rs.getString(1)+"<-----SNAME-->"+rs.getString(2)+"<-----SADD-->"+rs.getString(3)+"<-----SDEPT-->"+rs.getString(4)+"<-----SPHONE_NUMBER-->"+rs.getString(5));
			pw.print("<tr>");
			pw.print("<td>");
			pw.print(rs.getString(1));
			pw.print("</td>");
			pw.print("<td>");
			pw.print(rs.getString(2));
			pw.print("</td>");
			pw.print("<td>");
			pw.print(rs.getString(3));
			pw.print("</td>");
			pw.print("<td>");
			pw.print(rs.getString(4));
			pw.print("</td>");
			pw.print("<td>");
			pw.print(rs.getString(5));
			pw.print("</td>");
			pw.print("</tr>");
			}
		}
		pw.print("</table>");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	

}
}
