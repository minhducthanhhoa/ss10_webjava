<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 5/17/2025
  Time: 7:48 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Nhập thông tin người dùng</h2>
<form:form action="${pageContext.request.contextPath}/submit" method="post" modelAttribute="user">
    <p>Tên: <form:input path="name" /></p>
    <p>Tuổi: <form:input path="age" /></p>
    <p>Địa chỉ: <form:input path="address" /></p>
    <p><input type="submit" value="Gửi" /></p>
</form:form>
</body>
</html>
