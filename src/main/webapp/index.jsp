<%@ page language="java" contentType="text/html; charset=GB2312"
	pageEncoding="GB2312"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB2312">
<title>Insert title here</title>
</head>
<body>
	<a href="${pageContext.request.contextPath}/brand/addform">Add a
		New Brand</a>
	<br>
	<a href="${pageContext.request.contextPath}/brand/list">Query All
		Brand</a>

	<br>
	<br>
	<a href="${pageContext.request.contextPath}/model/addform">Add A
		New Model</a>
	<br>
	<a href="${pageContext.request.contextPath}/model/list">Query All
		Model</a>
	<br>
	<br>
	<a href="${pageContext.request.contextPath}/car/addform">Add A Car
		For Model</a>
	<br>
	<a href="${pageContext.request.contextPath}/car/list">List All Car</a>
	<br>
	<br>
	<a href="${pageContext.request.contextPath}/select/countrylist">Country List</a>
</body>
</html>