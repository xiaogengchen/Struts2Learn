<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2015/3/15 0015
  Time: 19:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title></title>
</head>
<body>
    <h3>使用逗号将点的两个坐标分割</h3>
    <s:form name="pointConverter">
        <s:textfield name="point" label="point"></s:textfield>
        <s:textfield name="age" label="age"></s:textfield>
        <s:textfield name="username" label="username"></s:textfield>
        <s:textfield name="date" label="birthday"></s:textfield>
        <s:submit label="submit"></s:submit>
    </s:form>
</body>
</html>
