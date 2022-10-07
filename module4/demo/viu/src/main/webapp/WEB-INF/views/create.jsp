<%--
  Created by IntelliJ IDEA.
  User: huyhoanghoangicloud.com
  Date: 9/30/22
  Time: 12:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Create</title>
</head>
<body>
<h1> Create</h1>
<form:form action="/add" method="post" modelAttribute="phone">
    <table>
        <tr>
            <td><form:label path="id" >id</form:label></td>
            <td><form:input path="id"/></td>
        </tr>
        <tr>
            <td><form:label path="name">name</form:label></td>
            <td><form:input path="name"/></td>
        </tr>
        <tr>
            <td><form:label path="manufacture">manufacturer</form:label></td>
            <td><form:input path="manufacture"/></td>
        </tr>
        <input type="submit" value="">
    </table>
</form:form>
</body>
</html>
