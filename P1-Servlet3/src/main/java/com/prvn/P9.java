package com.prvn;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class P9 extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		float a = Float.parseFloat(req.getParameter("w"));
		float b = Float.parseFloat(req.getParameter("h"));
		
		b = b/100;
		
		b = b*b;
		
		double bmi = a / b;
		
		req.setAttribute("bmi",bmi);
		req.setAttribute("b", b);
		
		RequestDispatcher rd = req.getRequestDispatcher("dp");
		rd.forward(req, res);
		
	}
}
