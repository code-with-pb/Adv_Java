package com.pravin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class P1 extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException,ServletException {
		
		//String fname = req.getParameter("FirstName");
		//String lname = req.getParameter("LastName");
		String usernm = req.getParameter("username");
		String pass = req.getParameter("Password");
		
		//res.setContentType("text/html");
		PrintWriter o = res.getWriter();
		
		o.print("<html>");
		o.print("<body>");
		o.print("<h1>Login Data</h1>");
		o.print("<p>username = "+usernm+" </p>");
		o.print("<p>password = "+pass+" </p>");
		o.print("</body>");
		o.print("</html>");
		o.close();
		
		//o.println("First Name: "+fname);
		//o.println("Last Name: "+lname);
		System.out.println("UserName: "+usernm);
		//System.out.println("Password: "+pass);
		o.println(usernm);
	}
}
