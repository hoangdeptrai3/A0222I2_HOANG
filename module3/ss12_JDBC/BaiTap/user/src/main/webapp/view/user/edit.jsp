<%--
  Created by IntelliJ IDEA.
  User: huyhoanghoangicloud.com
  Date: 9/5/22
  Time: 18:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<h1>EDIT</h1>
<a href="/user">Back to list</a>
<body>
<form action="/user?action=edit" method="post">
    pre>name : <input type="text" name="name"></pre>
    <pre>email : <input type="text" name="email"></pre>
    <pre>country : <input type="text" name="country"></pre>
    <button type="submit">EDIT</button>
</form>
</body>
</html>
