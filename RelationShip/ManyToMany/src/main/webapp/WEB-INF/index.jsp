
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!doctype html>
<html>
<body>
<h2 style="color:skyblue;">RelationShip</h2>
<form:form action="create" method="post" modelAttribute="user">
<table>
<tr>
<td>Name:</td>
<td><form:input type="text" path="name"/></td>
</tr>
<tr>
<td>Password:</td>
<td><form:input type="password" path="password"/></td>
</tr>

<tr>
<td>Roles:</td>
<td><form:input type="text" path="roles[0].rolename"/></td>
</tr>

<tr>
<td>Gender:</td>
<td><form:radiobutton path="gender" label="male" value="M"/>
<form:radiobutton path="gender" label="female" value="F"/>
</td>
</tr>
<tr>
<td><button>Submit</button></td>
</tr>
</table>
</form:form>
</body>
</html>
