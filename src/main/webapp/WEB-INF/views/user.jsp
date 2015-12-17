<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>List User</title>
</head>
<body>
	<c:if test="${not empty listUser}">
		<table>
			<c:forEach var="listValue" items="${listUser}">
				<tr>
					<td>${listValue.id}</td>
					<td>${listValue.firstName}</td>
					<td>${listValue.lastName}</td>
					<td>${listValue.email}</td>
				</tr>
			</c:forEach>
		</table>
	</c:if>
	
	<c:if test="${not empty user}">
		<table>
			<tr>
				<td>${user.id}</td>
				<td>${user.firstName}</td>
				<td>${user.lastName}</td>
				<td>${user.email}</td>
			</tr>
		</table>
	</c:if>
</body>
</html>