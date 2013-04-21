<%@ page language="java" contentType="text/html; charset=gbk"
	pageEncoding="gbk"%>
<%@page isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Model List</title>
</head>
<body>
	<table border="1">
		<tr>
			<td>Éú²ú³§ÉÌÃû³Æ</td>
			<td>Æ·ÅÆÃû³Æ</td>
			<td>ÆäËû</td>
		</tr>
		<c:if test="${not empty modelList}">
			<c:forEach items="${modelList}" var="model" varStatus="status">
				<tr>
					<td><a
				href="${pageContext.request.contextPath}/select/carlist/${model.id}">${model.modelName }</a></td>
					<td>${model.brandEntity.brandDescription }</td>
					<td>........</td>
				</tr>
			</c:forEach>

		</c:if>
	</table>
</body>
</html>