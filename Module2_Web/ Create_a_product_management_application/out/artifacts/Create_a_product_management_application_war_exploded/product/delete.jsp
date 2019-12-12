<%--
  Created by IntelliJ IDEA.
  User: Arin
  Date: 12/11/2019
  Time: 10:56 PM
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
    <a href="/product">Back to customer list</a>
</p>
<form method="post">
    <h3>Are you sure?</h3>
    <fieldset>
        <legend>Product information</legend>
        <table>
            <tr>
                <td>Product Name: </td>
                <td><label for="name"></label><input type="text" name="name" id="name" value="${requestScope["product"].getName()}"></td>
            </tr>
            <tr>
                <td>Price: </td>
                <td><label for="price"></label><input type="text" name="price" id="price" value="${requestScope["product"].getPrice()}"></td>
            </tr>
            <tr>
                <td>Producer: </td>
                <td><label for="producer"></label><input type="text" name="producer" id="producer" value="${requestScope["product"].getProducer()}"></td>
            </tr>
            <tr>
                <td>Description: </td>
                <td><label for="description"></label><input type="text" name="description" id="description" value="${requestScope["product"].getDescription()}"></td>
            </tr>
            <tr>
                <td><input type="submit" value="Delete product"></td>
                <td><a href="/product">Back to customer list</a></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>