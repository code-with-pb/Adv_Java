package com.prvn;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class P6 extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		PrintWriter o = res.getWriter();
		
		double bmi = Double.parseDouble(req.getParameter("bmi"));
		float h = Float.parseFloat(req.getParameter("h"));
		
		if(bmi>=18.4 && bmi <= 24.9) {
			double minw = 18.4 * h;
			double maxw = 24.9 * h;
			o.println("Minimum Weight: "+minw);
			o.println("Maximum weight: "+maxw);
		}
	}
}
