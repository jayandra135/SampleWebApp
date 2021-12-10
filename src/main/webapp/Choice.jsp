<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>

</head>
<body>
<%-- <c:set var ="marks" value="87"/>
 your marks<c:out value="${marks}"/>
 <c:choose>
 <c:when test="${marks<60}"> test failed</c:when>
<c:when test="${marks>60}"> test passed </c:when>
<c:otherwise> u r absent </c:otherwise>
</c:choose> --%>


<form>
Enter Name : <input type="text" name=name >
Enter Marks : <input type="text" name=n2 >
<input type=submit value=submit>

<c:if test="${pageContext.request.method=='GET'}">

	<c:set var="str" value ="${param.value}"/>
		<font size=12 color=green>
			<c:if test="${param.n2 >=60 && param.n2<75}">
				<c:out value="${'first class'}"/>
			</c:if>
			
			<c:if test="${param.n2>=75 && param.n2<90}">
				<c:out value="${'Dist class'}"/>
			</c:if>
			<c:if test="${param.n2 >=90 && param.n2<100}">
				<c:out value="${'A1 class'}"/>
			</c:if>
		</font>
		<font size=12 color=red>
			<c:if test="${param.n2 <60 }">
				<c:out value="${'fail class'}"/>
			</c:if>
		</font>	
	
		
</c:if>

</form>
</body>
</html>