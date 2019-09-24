<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>DETAILS</title>
    <</head>
<body>

<h2>Details</h2>
<table>
    <tr>
        <th>id</th>
        <th>carId</th>
        <th>typeId</th>
        <th>title</th>
    </tr>
    <c:forEach var="detail" items="${detailList}">
        <tr>
            <td>${detail.id}</td>
            <td>${detail.carId}</td>
            <td>${detail.detailTypeId}</td>
            <td>${detail.title}</td>
            <td>
                <a href="/edit/${detail.id}">edit</a>
                <a href="/delete/${detail.id}">delete</a>
            </td>
        </tr>
    </c:forEach>
</table>

<h2>Add</h2>
<c:url value="/add" var="add"/>
<a href="${add}">Add new detail</a>
</body>
</html>

