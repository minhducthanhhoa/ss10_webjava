<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 5/19/2025
  Time: 8:38 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Upload Document</h2>
<form:form modelAttribute="document" method="post" action="${pageContext.request.contextPath}/upload" enctype="multipart/form-data">
  Title: <form:input path="title" /><br/><br/>
  Description: <form:input path="description" /><br/><br/>
  File (PDF): <input type="file" name="file" accept="application/pdf" /><br/><br/>
  <input type="submit" value="Upload Document"/>
</form:form>
</body>
</html>
