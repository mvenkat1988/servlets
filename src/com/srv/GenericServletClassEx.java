package com.srv;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class GenericServletClassEx  extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("this is methoed service-----------------");
		res.setContentType("text/html");
		
		PrintWriter pw = res.getWriter();
		//HttpSession session=req.getSession(false);  
	    //String n=(String)session.getAttribute("uname");  
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

}
