package com.cts.srv;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

public class OurHttpServEx extends HttpServlet {

	
	public void init() throws ServletException {
		//super.init();
	}
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {	
		System.out.println("--------service()-------------");
		String uname = req.getParameter("name");
		String pass = req.getParameter("pwd");
		System.out.println(uname+"----------"+pass);
		PrintWriter pw = res.getWriter();
		pw.print(uname+"-----hi-----"+pass);
		if((uname.equalsIgnoreCase("Venkat") && pass.equalsIgnoreCase("Venkat")) || (uname.equalsIgnoreCase("Krishna") && pass.equalsIgnoreCase("Krishna"))){
			RequestDispatcher rd=req.getRequestDispatcher("/StudentInfo.html");  
	        rd.include(req, res);
	        RequestDispatcher rd1=req.getRequestDispatcher("/DeleteStudentInfo.html");  
	        rd1.include(req, res);
		}else {
			RequestDispatcher rd=req.getRequestDispatcher("/index.html");  // this nothing but login page
	        rd.include(req, res); 
		}
	
	}

}
