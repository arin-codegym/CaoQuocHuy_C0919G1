<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 10-12-19
  Time: 4:46 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Calculator</title>
</head>
<body>
<h1>Simple Calculator</h1>
<form method="post" action="${pageContext.request.contextPath}/calculate">
  <fieldset>
    <legend>Calculator</legend>
    <table>
      <tr>
        <td>First operand: </td>
        <td><label>
          <input name="first-operand" type="text"/>
        </label></td>
      </tr>
      <tr>
        <td>Operator: </td>
        <td>
          <label>
            <select name="operator">
              <option value="+">Addition</option>
              <option value="-">Subtraction</option>
              <option value="*">Multiplication</option>
              <option value="/">Division</option>
            </select>
          </label>
        </td>
      </tr>
      <tr>
        <td>Second operand: </td>
        <td><label>
          <input name="second-operand" type="text"/>
        </label></td>
      </tr>
      <tr>
        <td></td>
        <td><input type="submit" value="Calculate"/></td>
      </tr>
    </table>
  </fieldset>
</form>
</body>
</html>