<%@ page language="java" contentType="text/html; charset=gbk"
	pageEncoding="gbk"%>
<%@page isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gbk">
<title>Brand List</title>
</head>
<body>
<table border="1">
	<tr>
		<td>品牌名称</td>
		<td>品牌归属国</td>
		<td>品牌图像标志</td>
	</tr>
	<c:if test="${not empty brandList}">
		<c:forEach items="${brandList}" var="brand" varStatus="status">
			<tr>
				<td><a
					href="${pageContext.request.contextPath}/select/modellist/${brand.id}">${brand.brandDescription
				}</a></td>
				<td>${brand.countryEntity.countryName }</td>
				<td><img
					src="${pageContext.request.contextPath}/static/commonfiles/${brand.brandIconPath}" />
				</td>
			</tr>
		</c:forEach>

	</c:if>
</table>



</body>
</html>