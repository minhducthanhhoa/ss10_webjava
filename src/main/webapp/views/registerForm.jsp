<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 5/18/2025
  Time: 9:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Đăng ký tài khoản</h2>

<form:form modelAttribute="account" method="post" action="${pageContext.request.contextPath}/account/register">
    <table>
        <tr>
            <td>Tên đăng nhập:</td>
            <td><form:input path="username"/></td>
        </tr>
        <tr>
            <td>Mật khẩu:</td>
            <td><form:password path="password"/></td>
        </tr>
        <tr>
            <td>Email:</td>
            <td><form:input path="email"/></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="Đăng ký"/>
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>
