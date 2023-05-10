package com.prvn;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class P3 extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		String fnm = req.getParameter("fname");
		String lnm = req.getParameter("lname");
		
		String Full_Name = fnm + lnm;
		
		res.sendRedirect("jk?Full_Name="+Full_Name);
	}
}
