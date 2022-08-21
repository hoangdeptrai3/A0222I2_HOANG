<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Home
  Date: 8/17/2022
  Time: 8:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Title</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</head>
<body>
<h1>Trang list product</h1>
<a href="/product?action=create">Them moi</a>
<table class="table table-dark">
  <tr>
    <th>Id</th>
    <th>Name product</th>
    <th>price productr</th>
    <th>Manufacturer product</th>
    <th>Grantee By Year</th>
  </tr>
  <c:forEach var="product" items="${bookList}" varStatus="status">
    <tr>
      <td>${product.idProduct}</td>
      <td>${product.nameProduct}</td>
      <td>${product.priceProduct}</td>
      <td>${product.manufacturerProduct}</td>
      <td>${product.granteeByYear}</td>
    </tr>
  </c:forEach>

</table>
</body>
</html>
