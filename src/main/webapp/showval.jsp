<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Form Processing</h1>
<p><b>Welcome User:</b>
   <% String name =(String)session.getAttribute("uname");
   out.println(name);%>
</p>

	
	
</body>
</html>