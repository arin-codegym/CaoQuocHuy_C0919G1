<%--
  Created by IntelliJ IDEA.
  User: Arin
  Date: 12/10/2019
  Time: 12:34 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Currency Converter</title>
  <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
<h2>Currency Converter</h2>
<form method="post" action="${pageContext.request.contextPath}/converter">
  <label>Rate: </label><br/>
  <label>
    <input type="text" name="rate" placeholder="RATE" value="22000"/>
  </label><br/>
  <label>USD: </label><br/>
  <label>
    <input type="text" name="usd" placeholder="USD" value="0"/>
  </label><br/>
  <input type = "submit" id = "submit" value = "Converter"/>
</form>
</body>
</html>