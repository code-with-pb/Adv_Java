package com.prvn;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class P6 extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		PrintWriter o = res.getWriter();
		
		String fullnm = (String) req.getAttribute("fullnm");
		
		o.println(fullnm);
	}
}
