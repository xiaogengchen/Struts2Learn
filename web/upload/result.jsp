<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2015/3/21 0021
  Time: 11:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.io.*" %>
<html>
<head>
    <title>result.jsp</title>
</head>
<body>
<%--Information:${param["info"]}<br />--%>
<%--File:${param["file"]}--%>
<%
    InputStream is = request.getInputStream() ;
    BufferedReader br = new BufferedReader(new InputStreamReader(is)) ;
    String buffer = null ;
    while((buffer = br.readLine())!=null){
        out.println(buffer + "<br />") ;
    }
%>
</body>
</html>
