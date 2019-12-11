<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Arin
  Date: 12/11/2019
  Time: 10:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Customer List</title>
</head>
<body>
<h1>Customers</h1>
<p>
    <a href="/product?action=create">Create new customer</a>
</p>
<table border="1">
    <tr>
        <td>Name</td>
        <td>Price</td>
        <td>Producer</td>
        <td>Edit</td>
        <td>Delete</td>
    </tr>
    <c:forEach items='${requestScope["productList"]}' var="product">
        <tr>
            <td>
                <a href="${pageContext.request.contextPath}/product?action=view&id=${product.getId()}">${product.getName()}</a>
            </td>
            <td>${product.getPrice()}</td>
            <td>${product.getProducer()}</td>
            <td><a href="${pageContext.request.contextPath}/product?action=edit&id=${product.getId()}">edit</a></td>
            <td><a href="${pageContext.request.contextPath}/product?action=delete&id=${product.getId()}">delete</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>