<%@ page language="java" contentType="text/html; charset=gbk"
	pageEncoding="gbk"%>
<%@page isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gbk">
<title>Add Brand</title>
</head>
<body>
	<form id="brand" method="POST"
		action="${pageContext.request.contextPath}/brand/add"
		enctype="multipart/form-data">
		品牌名称:&nbsp;&nbsp;&nbsp;&nbsp;<input type="text"
			name="brandDescription"><br> 品牌辨识符:&nbsp;&nbsp;<input
			type="text" name="brandSortChar"><br> 品牌归属国: <select
			name="countryEntity.id">
			<option value="0">-----------</option>
			<c:if test="${not empty countryTypeList}">
				<c:forEach items="${countryTypeList}" var="country"
					varStatus="status">
					<option value="${country.id}">${country.countryName}</option>
				</c:forEach>
			</c:if>
		</select> <br> &nbsp;<input type="file" name="file" /> <br> <br> <br>
		<input type="submit" value="submit" />
	</form>
</body>
</html>