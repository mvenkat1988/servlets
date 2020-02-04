package com.srv;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class HttpServletClassEx extends HttpServlet {
	
	
		protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
			
			doPost(req, res);
			
		}

	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("this is methoed service-----------------");
		//res.setContentType("text/html");
		
		PrintWriter pw = res.getWriter();
	    
		String uname = req.getParameter("name");
		String password = req.getParameter("pwd");
		//HttpSession session=req.getSession();  
		//HttpSession session=req.getSession(true); 
		HttpSession session=req.getSession(false); 
		pw.println("hi...");
		if(uname.equalsIgnoreCase("Venkat")){
			if(password.equalsIgnoreCase("Venkat")){
				String uname1 = (String)session.getAttribute("uname");
				String password1 = (String)session.getAttribute("password");
				pw.println("User Login Details success.....");
				System.out.println("HI  ");
			}
		}else {
			RequestDispatcher rd=req.getRequestDispatcher("/index.html");  
	        rd.include(req, res); 
		}
		/*if(uname.equalsIgnoreCase("Venkat")&&password.equalsIgnoreCase("Venkat")){
			pw.println("hi");
			System.out.println("HI  ");
		}else if (uname.equalsIgnoreCase("Sandeep")&&password.equalsIgnoreCase("Sandeep")) {

			pw.println("hello:"+uname);
			System.out.println("HI  "+uname);
		
		}
		
		else {
			pw.println("Welcome " + uname);
			System.out.println("Welcome " + uname);
		}*/
		
	

	}

}
