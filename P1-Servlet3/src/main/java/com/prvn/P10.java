package com.prvn;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class P10 extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		PrintWriter o =res.getWriter();
		
		double bmi = Double.parseDouble((String) req.getAttribute("bmi"));
		float b = Float.parseFloat((String) req.getAttribute("b"));
		
		if(bmi>=18.5 && bmi<=24.9) {
			double minw = 18.5 * b;
			double maxw = 24.9 * b;
			o.println("Minimum Weight should be: "+minw);
			o.println("Maximum Weight should be: "+maxw);
		}
	}
}
