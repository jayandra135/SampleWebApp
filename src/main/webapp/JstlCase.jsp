<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%-- <form>
Enter String : <input type="text" name=string>

Uppercase <input type=radio name=case1 value=upper>
lowercase <input type=radio name=case1 value=lower>
<input type=submit value=change>

<c:if test="${pageContext.request.method=='GET'}">

	<c:set var="str" value ="${param.string}"/>
		<font size=12 color=green>
			<c:if test="${param.case1=='upper'}">
				<c:out value="${fn:toUpperCase(str) }"/>
			</c:if>
			
			<c:if test="${param.case1=='lower'}">
				<c:out value="${fn:toLowerCase(str) }"/>
			</c:if>
	
		</font>
</c:if>	
</form> --%>

<table border=2>
<tr>
<th>values</th>
<th>square</th>
</tr>
<c:forEach var="x" begin="0" end="10" step="1">
<tr>
<td><c:out value="${x}"/></td>
<td> <c:out value="${x*x }"/></td>

</tr>
</c:forEach>
</table>

</body>
</html>