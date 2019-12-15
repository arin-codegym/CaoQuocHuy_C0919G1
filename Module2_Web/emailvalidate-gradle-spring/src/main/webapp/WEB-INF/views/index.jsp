<%--
  Created by IntelliJ IDEA.
  User: Arin
  Date: 12/16/2019
  Time: 12:08 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Email Validation</title>
</head>
<body>

<h1>Email Validate</h1>
<h3 style="color:red">${message}</h3>

<form action="validate" method="post">
    <label>
        <input type="text" name="email">
    </label><br>
    <input type="submit" value="Validate">
</form>

</body>
</html>