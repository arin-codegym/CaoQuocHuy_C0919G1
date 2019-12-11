<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 11-12-19
  Time: 1:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Deleting customer</title>
</head>
<body>
<h1>Delete customer</h1>
<p>
    <a href="${pageContext.request.contextPath}/huy">Back to customer list</a>
</p>
<form method="post">
    <h3>Are you sure?</h3>
    <fieldset>
        <legend>Customer information</legend>
        <table>
            <tr>
                <td>Name: </td>
                <td>${requestScope["abc"].getName()}</td>
            </tr>
            <tr>
                <td>Email: </td>
                <td>${requestScope["abc"].getEmail()}</td>
            </tr>
            <tr>
                <td>Address: </td>
                <td>${requestScope["abc"].getAddress()}</td>
            </tr>
            <tr>
                <td><input type="submit" value="Delete customer"></td>
                <td><a href="${pageContext.request.contextPath}/huy">Back to customer list</a></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>