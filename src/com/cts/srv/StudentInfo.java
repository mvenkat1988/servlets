package com.cts.srv;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import com.Bean.StudentBean;
import com.DB.JDBCSingleton;
import com.service.StudentService;


public class StudentInfo extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("StudentInfo-Srvice---->");
		/*String sId = req.getParameter("sid");
		String sName = req.getParameter("sname");
		String sAdd = req.getParameter("sadd");
		String sDeptname = req.getParameter("sdeptname");
		String spnumber = req.getParameter("spnumber");*/
		StudentBean studentBean = new StudentBean();
		String sId = req.getParameter("sid");
		System.out.println("-SID------"+sId);
		if((sId!=null)&&(sId!="") && (!sId.equalsIgnoreCase(" "))){
		studentBean.setsId(req.getParameter("sid"));
		studentBean.setsName(req.getParameter("sname"));
		studentBean.setsAdd(req.getParameter("sadd"));
		studentBean.setsDept(req.getParameter("sdeptname"));
		studentBean.setsPhone_Number(req.getParameter("spnumber"));
		StudentService.insertStdInfo(studentBean);
		StudentService.getStdInfo(req,res);
		}else {
			RequestDispatcher rd=req.getRequestDispatcher("/StudentInfo.html"); 
			 rd.include(req, res);
			System.out.println("------else----");
		}
	}

}
