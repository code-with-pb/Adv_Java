package com.prvn;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class P7 extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		String fstname=req.getParameter("fstname");
		String lastname=req.getParameter("lastname");
		
		String fname=fstname+lastname;
		
		req.setAttribute("fname", fname);
		
		RequestDispatcher rd=req.getRequestDispatcher("ki");
		rd.forward(req, res);
	}
}