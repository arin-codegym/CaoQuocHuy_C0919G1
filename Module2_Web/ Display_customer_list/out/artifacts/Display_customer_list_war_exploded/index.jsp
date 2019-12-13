<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="model.Customer" %>

<%--

  Created by IntelliJ IDEA.
  User: Admin
  Date: 10-12-19
  Time: 2:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<h1> Display customer</h1>

<%
    List<Customer> list = new ArrayList<>();
    list.add(new Customer("Cao Quốc Huy", "11-11-1989", "Quảng Nam","https://vnn-imgs-a1.vgcloud.vn/streaming1.danviet.vn/upload/4-2019/images/2019-12-11/huy-1-1576032443-width650height433.jpg" ));
    list.add(new Customer("Trần Viết Dũng", "01-01-1992", "Thanh Hóa", ""));
    list.add(new Customer("Nguyễn Văn Toàn", "01-01-1989", "Đà Nẵng", ""));

%>
<c:forEach var="cuslist" items="<%=list%>">
    <c:out value="${cuslist.toString()}"/>
    <img src="${cuslist.getImage()}">
  <br>
</c:forEach>

</body>
</html>
