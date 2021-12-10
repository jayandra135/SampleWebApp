<%@page import="mybeans.LocalBean" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="myBean" class="mybeans.LocalBean"></jsp:useBean>

<jsp:setProperty property="cost" name="myBean" value="10.0"/>

<jsp:getProperty property="markup" name="myBean"/>
<jsp:getProperty property="subtotal" name="myBean"/>
<jsp:getProperty property="vat" name="myBean"/>
<jsp:getProperty property="total" name="myBean"/>

${myBean.markup}

</body>
</html>