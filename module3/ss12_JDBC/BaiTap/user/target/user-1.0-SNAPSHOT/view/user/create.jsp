<%--
  Created by IntelliJ IDEA.
  User: huyhoanghoangicloud.com
  Date: 9/5/22
  Time: 11:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Them moi</title>
    <a href="/user">Back to list user</a>
    <c:if test="${mess!=null}">
        <p style="color: red">${mess}</p>
    </c:if>
</head>
<body>
<form action="/user?action=create" method="post">
<%--    <pre> id     : <input type="text" name="id" id=""></pre>--%>
    <pre> name   : <input type="text" name="name" ></pre>
    <pre> email  : <input type="text" name="email" > </pre>
    <pre> country: <input type="text" name="country"></pre>
    <button type="submit">Thêm mới</button>
</form>
</body>
</html>
