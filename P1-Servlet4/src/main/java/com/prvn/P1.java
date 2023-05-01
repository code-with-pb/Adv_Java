package com.prvn;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class P1 extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException,ServletException {
		
		int a = Integer.parseInt(req.getParameter("num1"));
		int b = Integer.parseInt(req.getParameter("num2"));
		
		int k = a+b;
		
		res.sendRedirect("as?k="+k);
	}
}
