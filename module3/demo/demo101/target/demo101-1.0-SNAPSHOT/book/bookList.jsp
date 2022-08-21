<%--
  Created by IntelliJ IDEA.
  User: huyhoanghoangicloud.com
  Date: 8/20/22
  Time: 18:43
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>

</head>
<body>
<table class="table table-dark">
    <tr>
        <th>Name</th>
        <th>Price</th>
        <th>Manufacturer</th>
    </tr>
        <c:forEach var="book" items="${bookList}">
            <tr>
                <td>${book.name}</td>
                <td>${book.price}</td>
                <td>${book.manufacturer}</td>
            </tr>
        </c:forEach>
</table>
</body>
</html>
