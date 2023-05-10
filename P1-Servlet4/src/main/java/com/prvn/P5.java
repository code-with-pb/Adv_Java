package com.prvn;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class P5 extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		float w = Float.parseFloat(req.getParameter("w"));
		float h = Float.parseFloat(req.getParameter("h"));
		
		h = h/100;
		h = h *h;
		
		double bmi = w/h;
		
		//res.sendRedirect("b?h="+h);
		res.sendRedirect("b?bmi="+bmi);
	}
}
