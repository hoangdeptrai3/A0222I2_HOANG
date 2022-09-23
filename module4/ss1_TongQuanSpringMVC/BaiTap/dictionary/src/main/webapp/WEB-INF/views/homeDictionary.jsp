<%--
  Created by IntelliJ IDEA.
  User: huyhoanghoangicloud.com
  Date: 9/23/22
  Time: 09:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/test" method="post">
    <lable>ENG</lable>
    <input type="text" value="${eng}" name="eng">
    <lable>VN</lable>
    <input type="text" value="${vn}" name="">
    <input type="submit" value="->">
</form>

</body>
</html>
