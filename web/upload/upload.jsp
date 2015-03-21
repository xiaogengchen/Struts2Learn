<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2015/3/21 0021
  Time: 10:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>upload.jsp</title>
</head>
<body>
    <form action="result.jsp" method="post"><!--enctype="multipart/form-data"-->
        information:<input type="text" name="info" /><br />
        File:<input type="file" name="file" /><br/>
        <input type="submit" name="submit" value="submit" />
    </form>
</body>
</html>
