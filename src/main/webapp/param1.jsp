<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%-- <jsp:include page="param2.jsp">

	<jsp:param value="jay" name="user"/>
	<jsp:param value="mike" name="key"/>
</jsp:include> --%>

<%@ include file="IncludeDir.html" %>  
  
Today is: <%= java.util.Calendar.getInstance().getTime() %>  
</body>
</html>