<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@	taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add animal</title>
<style type="text/css">
	.error{
		color: red;
	}
</style>
</head>
<body>

	<form:form method="post" modelAttribute="tag">
		
		<label>Animal name: </label>
		<form:input path="name" />
		<form:errors path="name" cssClass="error" />
		<br>
		
		<%-- <label>Tag active: </label>
		<form:checkbox	path="active"/>
		<input type="submit" value="Add"> --%>

	</form:form>
</body>
</html>