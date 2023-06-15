<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 6/15/2023
  Time: 8:25 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>Chuyển đổi USD sang VND</h3>
<form method="post" action="/currency">
    <input type="number" name="usd">
    <input type="number" name="rate" value="23000">
    <button type="submit">Chuyen doi</button>
    <h2>Chuyen doi: ${vnd}</h2>
</form>
</body>
</html>
