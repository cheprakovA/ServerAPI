<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <c:if test="${empty detail.title}">
        <title>Add</title>
    </c:if>
    <c:if test="${!empty detail.title}">
        <title>Edit</title>
    </c:if>
</head>
<body>
<c:if test="${empty detail.title}">
    <c:url value="/add" var="var"/>
</c:if>
<c:if test="${!empty detail.title}">
    <c:url value="/edit" var="var"/>
</c:if>
<form action="${var}" method="POST">
    <c:if test="${!empty detail.title}">
        <input type="hidden" name="id" value="${detail.id}">
    </c:if>
    <label for="carId">CarId</label>
    <input type="text" name="carId" id="carId">
    <label for="typeId">TypeId</label>
    <input type="text" name="typeId" id="typeId">
    <label for="title">Title</label>
    <input type="text" name="title" id="title">
    <c:if test="${empty detail.title}">
        <input type="submit" value="Add new detail">
    </c:if>
    <c:if test="${!empty detail.title}">
        <input type="submit" value="Edit detail">
    </c:if>
</form>
</body>
</html>