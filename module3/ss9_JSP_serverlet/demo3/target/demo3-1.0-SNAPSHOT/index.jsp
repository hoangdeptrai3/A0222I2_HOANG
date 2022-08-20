<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Operator" %></h1>
<br/>
<form action="/hello-servlet" method="post">
    <label for="">
        Enter a
    </label>
    <input type="text" name="a" value="${aa}">
    <br>
    <label for="">
        Enter b
    </label>
    <input type="text" name="b" value="${bb}">
    <br>
    <label for="">
        Calculator
    </label>
    <select name="operator">
        <option ${add}>+</option>
        <option ${sub}>-</option>
        <option ${multi}>*</option>
        <option ${divv}>/</option>
    </select>
    <br>
    <button type="submit">OK</button>
    <br>
    <label>Result</label>
    <input type="text" value="${rs}">
    <br>
    <a href="/hello-servlet">next</a>
</form>
</body>
</html>