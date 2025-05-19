<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 5/17/2025
  Time: 11:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Nhập thông tin sản phẩm</h2>
<form:form action="${pageContext.request.contextPath}/add-product" modelAttribute="product" method="post">
    <p>Tên sản phẩm: <form:input path="name"/></p>
    <p>Giá: <form:input path="price"/></p>
    <p>Mô tả: <form:textarea path="description"/></p>
    <input type="submit" value="Gửi" />
</form:form>
</body>
</html>
