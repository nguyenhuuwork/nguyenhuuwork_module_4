<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 6/15/2023
  Time: 3:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>Từ vựng trái cây</h3>
<form method="post" action="/convert">
    <input type="text" name="english">
    <button type="submit">Dich</button>
    <input type="" name="vietsub" value="${english}">
</form>
</body>
</html>
