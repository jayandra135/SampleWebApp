<%@ page import="java.util.*" %>
<%
Map mp=new HashMap();
mp.put("name","jay");
mp.put("city","mum");
mp.put("state","mh");
request.setAttribute("usemap",mp);
session.setAttribute("clr","");
pageContext.setAttribute("clr","yellow");

%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%-- <%out.println(request.getAttribute("usemap")); %> --%>

<%-- ${usemap["name"] } --%>

<table bgcolor="${clr }" border=1>
<tr>
<td>${usemap["name"] }</td>
</tr>
</table>
<a href="req.jsp">click</a>
</body>
</html>