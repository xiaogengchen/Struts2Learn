<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2015/3/17 0017
  Time: 10:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>register2</title>
</head>
<body>
    <table align="center">
       <tr>
           <td>
               <s:fielderror cssStyle="color:red" />
           </td>
       </tr>
    </table>
    <s:form action="register" theme="simple">
        <table align="center" width="40%" border="1">
            <tr>
                <td>
                    username
                </td>
                <td>
                    <s:textfield name="username" label="username"></s:textfield>
                </td>
            </tr>
            <tr>
                <td>
                    password
                </td>
                <td>
                    <s:password name="password" label="password"></s:password>
                </td>
            </tr>
            <tr>
                <td>
                    repassword
                </td>
                <td>
                    <s:password name="repassword" label="repassword"></s:password>
                </td>
            </tr>
            <tr>
                <td>
                    age
                </td>
                <td>
                    <s:textfield name="age" label="age"></s:textfield>
                </td>
            </tr>
            <tr>
                <td>
                    birthday
                </td>
                <td>
                    <s:textfield name="birthday" label="birthday"></s:textfield>
                </td>
            </tr>
            <tr>
                <td>
                   graduation
                </td>
                <td>
                    <s:textfield name="graduation" label="graduation"></s:textfield>
                </td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <s:submit value="submit"></s:submit>
                </td>
            </tr>
        </table>
    </s:form>
</body>
</html>
