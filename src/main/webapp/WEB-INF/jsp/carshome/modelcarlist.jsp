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
			<td>��������</td>
			<td>Ʒ�ƹ�����</td>
			<td>��������</td>
			<td>������͹���(��Ԫ)</td>
			<td>������߹���(��Ԫ)</td>
			<td>Ʒ��ͼ���־</td>
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