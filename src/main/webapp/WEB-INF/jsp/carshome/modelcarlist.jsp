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
			<td>车辆名称</td>
			<td>品牌归属国</td>
			<td>厂商名称</td>
			<td>车辆最低估价(万元)</td>
			<td>车辆最高估价(万元)</td>
			<td>品牌图像标志</td>
		</tr>
		<c:if test="${not empty modelCarList}">
			<c:forEach items="${modelCarList}" var="modelCar" varStatus="status">
				<tr>
					<td>${modelCar.carName }</td>
					<td>${modelCar.brandModelEntity.brandEntity.countryEntity.countryName
						}</td>
					<td>${modelCar.brandModelEntity.modelName}</td>
					<td>${modelCar.minPrice }</td>
					<td>${modelCar.maxPrice }</td>
					<td><img
						src="${pageContext.request.contextPath}/static/commonfiles/car/${modelCar.carIconPath}" />
					</td>
				</tr>
			</c:forEach>

		</c:if>
	</table>



</body>
</html>