package com.prvn;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class P2 extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		HttpSession hs = req.getSession();
		
		String name = (String) hs.getAttribute("name");
		
		PrintWriter o = res.getWriter();
		
		o.println(name);
	}
}
