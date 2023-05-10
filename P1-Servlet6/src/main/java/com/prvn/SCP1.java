package com.prvn;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SCP1 extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		PrintWriter o = res.getWriter();
		
		o.println("hi");
		
		ServletContext ctx = getServletContext();//ServletConfig cg = getServletConfig();
		String s = ctx.getInitParameter("name");//instread of ctx use cg to get differnet name;
		
		String b = ctx.getInitParameter("model");
		
		o.println(s+" use "+b);
		
		//in xml file for servlet config tou just add in html and java link com.prvn.p1 after that
		
		//<init-param>
			//<param-name>name<param-name>
			//<param-value>Sachin<param-value>
		//</init-param>
		
	}
}
