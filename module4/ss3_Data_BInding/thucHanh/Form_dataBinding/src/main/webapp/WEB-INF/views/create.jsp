<%--
  Created by IntelliJ IDEA.
  User: huyhoanghoangicloud.com
  Date: 9/29/22
  Time: 13:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Create</title>
</head>
<body>
    <form:form method="post" action="/add" modelAttribute="employee">
        <tr>
            <td>
                <form:label path="id">Employee ID :</form:label>
            </td>
            <td>
                <form:input path="id"/></td>
            </td>
        </tr>
        <tr>
            <td>
                <form:label path="name">Employee name :</form:label>
            </td>
            <td>
                <form:input path="name"/>
            </td>
        </tr>
        <tr>
            <td>
               <form:label path="contactNumber">Contact Number</form:label>
            </td>
            <td>
                <form:input path="contactNumber"/>
            </td>
        </tr>
        <tr>
            <td>
                <input type="submit" value="submit">
            </td>
        </tr>

    </form:form>
</body>
</html>
