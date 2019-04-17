<%--
  Created by IntelliJ IDEA.
  User: ahmed
  Date: 4/15/2019
  Time: 7:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Index</title>
</head>
<body>
<form action="ImprovedCalculator" method="post">
    <h1>Welcome to CS472 Web Programming</h1>
    <p><input type="text" name="val1" pattern="[0-9]"/> +
        <input type="text" name="val2" pattern="[0-9]"/> =
        <input type="text" name="sum" readonly/> </p>
    <p><input type="text" name="val3" pattern="[0-9]"/> *
    <input type="text" name="val4" pattern="[0-9]"/> =
    <input type="text" name="product" readonly/></p>
    <p><input type="submit"/></p>
</form>
</body>
</html>
