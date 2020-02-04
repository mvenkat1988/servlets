package com.srv;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

//HttpServlet
/*
 *
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class DemoServ extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		String name = req.getParameter("name");
		String password = req.getParameter("pwd");
		if(name.equalsIgnoreCase("Venkat")&&password.equalsIgnoreCase("Venkat")){
			pw.println("hi");
		}else {
			pw.println("Welcome " + name);
		}
		
	}
	}
*/

//Servlet IN
/*
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class DemoServ implements Servlet{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
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

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
	res.setContentType("text/html");
	PrintWriter pw = res.getWriter();
	String name = req.getParameter("name");
	String password = req.getParameter("pwd");
	if(name.equalsIgnoreCase("Venkat")&&password.equalsIgnoreCase("Venkat")){
		pw.println("hi");
	}else {
		pw.println("Welcome " + name);
	}}
	
}*/
/*GenericServlet
public class DemoServ extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {res.setContentType("text/html");
	PrintWriter pw = res.getWriter();
	String name = req.getParameter("name");
	String password = req.getParameter("pwd");
	if(name.equalsIgnoreCase("Venkat")&&password.equalsIgnoreCase("Venkat")){
		pw.println("hi");
	}else {
		pw.println("Welcome " + name);
	}}
	
}*/