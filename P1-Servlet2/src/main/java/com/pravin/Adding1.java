package com.pravin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Adding1 extends HttpServlet
{
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException{
		
		int a,b;
		a = Integer.parseInt(req.getParameter("num1"));
		b = Integer.parseInt(req.getParameter("num2"));
		
		int c = a + b;
		
		PrintWriter o = res.getWriter();
		
		o.println("OutPut = "+c);
	}
	/*public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		int c = Integer.parseInt(req.getParameter("OutPut"));
		
		PrintWriter k = res.getWriter();
		
		System.out.println(c);
	}*/
}
