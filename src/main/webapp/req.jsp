<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%> --%>
    
<%@page import="java.util.*,java.io.*" contentType="text/xml" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor=red>
<ul>

<li><%=request.getServerName()%></li>
<li><%=request.getServerPort() %></li>
<li><%=request.getProtocol() %></li>
<li><%=request.getRemoteAddr() %></li>

<%=new Date() %>
<%out.println(session.getAttribute("clr")); %>
</ul>

<%-- 
<% String username=request.getParameter("user");
	if(username==null)
		username="";
	session.setAttribute("uname",username);

%>
<a href="showval.jsp">show</a> --%>

</body>
</html>