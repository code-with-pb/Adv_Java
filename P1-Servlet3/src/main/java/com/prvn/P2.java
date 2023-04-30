package com.prvn;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class P2 extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		PrintWriter o = res.getWriter();
		
		int k = (int) req.getAttribute("k"); //(int) because it will giving us string value so we typecast it 
		
		int s = k *k;
		
		o.println(k);
		o.println("Square = "+s);
	}
}
