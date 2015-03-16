<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2015/3/16 0016
  Time: 16:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>success</title>
</head>
<body>
<form action="register" method="post">
    <table align="center" width="40%" border="1">
        <tr>
            <td>username:</td>
            <td>${requestScope.username}</td>
        </tr>
        <tr>
            <td>password:</td>
            <td>${requestScope.password}</td>
        </tr>
        <tr>
            <td>age:</td>
            <td>${requestScope.age}</td>
        </tr>
        <tr>
            <td>birthday:</td>
            <td>${requestScope.birthday}</td>
        </tr>
        <tr>
            <td>graduation:</td>
            <td>${requestScope.graduation}</td>
        </tr>
    </table>
</form>
</body>
</html>
