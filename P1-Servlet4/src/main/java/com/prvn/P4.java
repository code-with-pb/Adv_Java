package com.prvn;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class P4 extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException,ServletException {
		
		String Full_Name = (String) req.getParameter("Full_Name");
		
		
		PrintWriter o = res.getWriter();
		
		o.println(Full_Name);
	}

}
