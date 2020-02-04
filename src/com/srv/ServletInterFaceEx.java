package com.srv;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ServletInterFaceEx  implements Servlet{

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		System.out.println("this is methoed init-----------------");
		
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("this is methoed service-----------------");
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		String uname = req.getParameter("name");
		String password = req.getParameter("pwd");
		if(uname.equalsIgnoreCase("Venkat")&&password.equalsIgnoreCase("Venkat")){
			pw.println("hi");
			System.out.println("HI  ");
		}else {
			pw.println("Welcome " + uname);
			System.out.println("Welcome " + uname);
		}
		}
		
	@Override
	public void destroy() {
		System.out.println("this is methoed destroy-----------------");
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}
}
