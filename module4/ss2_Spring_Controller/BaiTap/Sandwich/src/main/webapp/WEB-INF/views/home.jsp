<%--
  Created by IntelliJ IDEA.
  User: huyhoanghoangicloud.com
  Date: 9/25/22
  Time: 19:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Sandwich Condiments</h1><br>
<form action="/test" method="post">
    <input type="checkbox" name="a" value="Lettuce">Lettuce
    <input type="checkbox" name="a" value="Tomato">Tomato
    <input type="checkbox" name="a" value="Mustard">Mustard
    <input type="checkbox" name="a" value="Sprouts">Sprouts
    <br>
    <hr>
    <input type="Submit" value="Save">
</form>
<h2>
    result: ${result}
</h2>
</body>
</html>
