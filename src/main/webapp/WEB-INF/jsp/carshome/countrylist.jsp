<%@ page language="java" contentType="text/html; charset=gbk"
	pageEncoding="gbk"%>
<%@page isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gbk">
<title>Country List</title>
</head>
<body>


	<c:if test="${not empty countryTypeList}">
		<c:forEach items="${countryTypeList}" var="country" varStatus="status">

			<a
				href="${pageContext.request.contextPath}/select/brandlist/${country.id}">${country.countryName}</a>
			<br>
			<br>
		</c:forEach>
	</c:if>



</body>
</html>