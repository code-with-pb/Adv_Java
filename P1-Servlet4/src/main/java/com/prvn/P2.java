package com.prvn;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class P2 extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException,ServletException {
		
		int k = Integer.parseInt(req.getParameter("k"));
		
		k = k*k;
		
		PrintWriter o = res.getWriter();
		
		o.println("Result = "+k);
		
		o.println("hello");
	}
}
