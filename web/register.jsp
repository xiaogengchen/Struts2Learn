<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2015/3/16 0016
  Time: 16:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>register.jsp</title>
</head>
<body>
    <table align="center" width="35%">
        <tr>
            <td style="color:red">
                <s:fielderror></s:fielderror>
            </td>
        </tr>
    </table>
    <form action="register" method="post">
        <table align="center" width="35%" border="1">
            <tr>
                <td>username:</td>
                <td><input type="text" name="username" /></td>
            </tr>
            <tr>
                <td>password:</td>
                <td><input type="password" name="password" /></td>
            </tr>
            <tr>
                <td>repassword:</td>
                <td><input type="password" name="repassword" /></td>
            </tr>
            <tr>
                <td>age:</td>
                <td><input type="text" name="age" /></td>
            </tr>
            <tr>
                <td>birthday:</td>
                <td><input type="text" name="birthday" /></td>
            </tr>
            <tr>
                <td>graduation:</td>
                <td><input type="text" name="graduation" /></td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <input type="submit" value="submit" />
                    <input type="reset" value="reset" />
                </td>
            </tr>
        </table>
    </form>
</body>
</html>
