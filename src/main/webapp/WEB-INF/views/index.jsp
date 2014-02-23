<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Playground</title>
</head>
<body>
<h1>List of All Customers</h1>
<ul>
    <c:forEach var="c" items="${customers}">
        <li>${c.firstName} - ${c.lastName}</li>
    </c:forEach>
</ul>

</body>
</html>