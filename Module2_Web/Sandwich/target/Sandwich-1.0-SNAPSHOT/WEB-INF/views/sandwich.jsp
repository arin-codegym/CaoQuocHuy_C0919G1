<%--
  Created by IntelliJ IDEA.
  User: Arin
  Date: 12/16/2019
  Time: 11:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="/save">
    <input type="checkbox" name="condiment" value="lettuce"> Lettuce
    <input type="checkbox" name="condiment" value="tomato"> Tomato
    <input type="checkbox" name="condiment" value="mustard" checked> Mustard
    <input type="checkbox" name="condiment" value="sprouts"> Sprouts
    <br><br>
    <input type="submit" value="Save">
</form>
<p>Danh sách đã chọn ${condiment}</p>
</body>
</html>
