<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 5/18/2025
  Time: 10:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Upload Ảnh Đại Diện</h2>

<form:form modelAttribute="userProfile" method="post" action="${pageContext.request.contextPath}/profile/upload" enctype="multipart/form-data">
    <table>
        <tr>
            <td>Tên người dùng:</td>
            <td><form:input path="username"/></td>
        </tr>
        <tr>
            <td>Chọn ảnh đại diện:</td>
            <td><form:input path="avatar" type="file"/></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="Upload"/>
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>
