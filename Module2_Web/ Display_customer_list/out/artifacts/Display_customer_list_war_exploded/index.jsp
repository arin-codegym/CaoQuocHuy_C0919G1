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
    list.add(new Customer("Cao Quốc Huy", "11-11-1989", "Quảng Nam", "src=https://scontent.fdad1-1.fna.fbcdn.net/v/t1.0-9/s960x960/54730835_2129292107184254_4294296778590650368_o.jpg?_nc_cat=106&_nc_ohc=M4SSDyIIcN4AQknQcoNfVRYwQfqGb9_-x5t1G3xYF5NFOW-pGWt1T1FJQ&_nc_ht=scontent.fdad1-1.fna&oh=4017a67099a39e3256d22beb65f392c7&oe=5E85FECE"));
    list.add(new Customer("Trần Viết Dũng", "01-01-1992", "Thanh Hóa", ""));
    list.add(new Customer("Nguyễn Văn Toàn", "01-01-1989", "Đà Nẵng", ""));

%>
<c:forEach var="cuslist" items="<%=list%>">
    <c:out value="${cuslist.toString()}"/>
  <br>
</c:forEach>

</body>
</html>
