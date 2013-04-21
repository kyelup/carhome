<%@ page language="java" contentType="text/html; charset=gbk"
	pageEncoding="gbk"%>
<%@page isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gbk">
<title>Add Model Car</title>
</head>
<body>
<body>
	<form id="modelCarEntity" method="POST"
		action="${pageContext.request.contextPath}/car/add"
		enctype="multipart/form-data">
		车辆型号名称:<input type="text" name="carName"><br>
		最底价格:&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="minPrice"><br>
		最高价格:&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="maxPrice"><br>
		所属制造商:&nbsp; <select name="brandModelEntity.id">
			<option value="0">-----------</option>
			<c:if test="${not empty modelList}">
				<c:forEach items="${modelList}" var="model" varStatus="status">
					<option value="${model.id}">${model.modelName}</option>
				</c:forEach>
			</c:if>
		</select> <br> <br>&nbsp;<input type="file" name="file" /> <br>
		<br> <br> <input type="submit" value="submit" />
	</form>
</body>
</body>

</html>