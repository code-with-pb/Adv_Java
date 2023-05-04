<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP File</title>
</head>
<body bgcolor = "skyblue">
	<%  
	String s = request.getParameter("n1");
	String m = request.getParameter("m1");
	
	out.println(s+" "+m);
	%>
</body>
</html>