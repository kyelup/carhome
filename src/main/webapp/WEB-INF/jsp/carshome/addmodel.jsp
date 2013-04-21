<%@ page language="java" contentType="text/html; charset=gbk"
	pageEncoding="gbk"%>
<%@page isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gbk">
<title>Add Model</title>
</head>
<body>


	<form id="brand" method="POST"
		action="${pageContext.request.contextPath}/model/add">
		生产厂家标识符:&nbsp;<input type="text" name="modelName"><br><br>
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;所属品牌: <select name="brandEntity.id">
			<option value="0">-----------</option>
			<c:if test="${not empty brandList}">
				<c:forEach items="${brandList}" var="brand" varStatus="status">
					<option value="${brand.id}">${brand.brandDescription}</option>
				</c:forEach>
			</c:if>
		</select> <br> <br> <br> <input type="submit" value="submit" />

	</form>

</body>
</html>