<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 6/15/2023
  Time: 2:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="/currency">
    <input type="number" name="usd">
    <input type="number" name="rate" value="23000">
    <button type="submit">Send</button>
    <h3>Chuyen doi: ${vnd}</h3>
</form>
</body>
</html>
