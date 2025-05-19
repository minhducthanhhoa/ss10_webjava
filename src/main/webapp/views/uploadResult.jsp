<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 5/18/2025
  Time: 10:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>${message}</h3>
<c:if test="${not empty filename}">
  <p>Ảnh đã upload: <img src="/images/${filename}" width="150"/></p>
</c:if>
<a href="${pageContext.request.contextPath}/profile/upload">Upload lại</a>
</body>
</html>
