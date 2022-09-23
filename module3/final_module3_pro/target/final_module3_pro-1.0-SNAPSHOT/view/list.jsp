<%--
  Created by IntelliJ IDEA.
  User: huyhoanghoangicloud.com
  Date: 9/14/22
  Time: 17:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
      integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
        crossorigin="anonymous"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>List</title>
</head>
<body>
<a class="add" href="/mat_bang?action=create">+ Add New Product</a>
<span>
    <form action="/mat_bang?action=search" method="post">
    <div class="form-group"
         style=";display: flex;align-items: center;justify-content: end;flex-direction: row">
        <input class="form-control me-2" style="width: 200px;margin: 1em" type="search" name="nameSearch"
               value="${nameSearch}" placeholder="Input name search " aria-label="Search">
        <button class="btn btn-outline-primary" type="submit">Search</button>
    </div>
    </form>
</span>
<table class="table">
    <tr>
        <th>STT</th>
        <th>Ma MB</th>
        <th>Dien Tich</th>
        <th>Trang Thai</th>
        <th>Tang</th>
        <th>Loai Van Phong</th>
        <th>Mo Ta Chi Tiet</th>
        <th>Gia cho Thue</th>
        <th>Ngay Bat Dau</th>
        <th>ACTION</th>
    </tr>
    <c:forEach var="matbang" items="${listMatBang}" varStatus="varStatus">
        <tr>
            <td>${varStatus.count}</td>
            <td>${matbang.maMatBang}</td>
            <td>${matbang.dienTich}</td>
            <td>${matbang.trangThai}</td>
            <td>${matbang.tang}</td>
            <c:forEach var="l" items="${loaimbList}">
                <c:if test="${l.id == matbang.idLoaiMB}">
                    <td>${l.name}
                    </td>

                </c:if>
            </c:forEach>
            <td>${matbang.moTaChiTiet}</td>
            <td>${matbang.giaChoThue}</td>
            <td>${matbang.ngayBatDau}</td>
            <td>
                <!-- Button trigger modal update-->
                <button type="button" class="btn btn-outline-primary btn-update" onclick="onUpdate(this)"
                        data-id="${product.id}" data-name="${product.name}" data-price="${product.price}"
                        data-quantity="${product.quantity}" data-color="${product.color}"
                        data-category="${product.idCategory}"
                        data-bs-toggle="modal"
                        data-bs-target="#exampleModalUpdate">
                    Update
                </button>
                <button type="button" onclick="deleteInfo('${product.id}','${product.name}')" class="btn btn-danger"
                        data-bs-toggle="modal" data-bs-target="#exampleModal">
                    Delete
                </button>
            </td>
        </tr>
    </c:forEach>

</table>

<!-- Modal delete -->
<div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <form action="product?action=delete" method="post">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="exampleModalLabel">Modal title</h5>
                    <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                </div>
                <div class="modal-body">
                    <input type="hidden" name="idDelete" id="idDelete">
                    <span>Do you wan delete <span id="deleteName"> </span> </span>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
                    <button type="submit" class="btn btn-primary">Ok</button>
                </div>
            </div>
        </form>
    </div>
</div>

<script>
    function deleteInfo(id, name) {
        document.getElementById("idDelete").value = id;
        document.getElementById("deleteName").innerText = name;
    }

</script>

</body>
</html>
