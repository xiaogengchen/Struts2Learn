<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2015/3/15 0015
  Time: 17:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
    <title>login2.jsp</title>
</head>
<body>
<s:form action="login" method="post">
    <s:textfield name="username" label="username"></s:textfield>
    <s:textfield name="password" label="password"></s:textfield>
    <s:submit label="submit"></s:submit>
</s:form>

</body>
</html>
