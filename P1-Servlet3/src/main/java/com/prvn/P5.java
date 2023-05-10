package com.prvn;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class P5 extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		String fname = req.getParameter("fname");
		String lname = req.getParameter("lname");
		
		String fullnm = fname + lname;
		
		req.setAttribute("fullnm", fullnm);
		RequestDispatcher rd = req.getRequestDispatcher("nd");
		rd.forward(req, res);
	}
}
