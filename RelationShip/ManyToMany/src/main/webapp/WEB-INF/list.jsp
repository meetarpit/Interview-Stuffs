<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
<tr>
<th>Name</th>
<th>Password</th>
<th>Gender</th>
<th>Roles</th>
</tr>
<c:forEach items="${user}" var="user">
<tr>
<td>${user.name}</td>
<td>${user.password}</td>
<td>${user.gender}</td>
<td>${user.roles[0].rolename}</td>
</tr>
</c:forEach>
</table>
</body>
</html>