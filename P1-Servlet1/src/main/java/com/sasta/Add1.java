package com.sasta;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Add1 extends HttpServlet
{
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{
		// int i = req.getParameter("num1"); This give string so we need to write like
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int k = i + j;
		
		//System.out.println("Addition of Two No is: "+k); it print on console not on web
		
		//for that we need to write 
		
		PrintWriter o = res.getWriter();
		
		o.println("Addition of Two No is: "+k);
	}
}
