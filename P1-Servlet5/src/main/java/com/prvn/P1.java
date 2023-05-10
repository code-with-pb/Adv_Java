package com.prvn;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class P1 extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		String fname = req.getParameter("fname");
		String lname = req.getParameter("lname");
		
		String name = fname + lname;
		
		HttpSession hs = req.getSession();
		hs.setAttribute("name", name);
		
		res.sendRedirect("addi?name="+name);
	}
}
