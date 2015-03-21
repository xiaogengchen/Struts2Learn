<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2015/3/21 0021
  Time: 14:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>upload2.jsp</title>
</head>
<body>
    <form action="/S2L/UploadServlet" method="post" enctype="multipart/form-data">
        username:<input type="text" name="username" /><br />
        password:<input type="password" name="password" /><br />
        file1:<input type="file" name="file1" /><br />
        file2:<input type="file" name="file2" /><br />
        <input type="submit" value="submit" />
    </form>
</body>
</html>
