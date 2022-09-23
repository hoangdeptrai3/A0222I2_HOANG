<%--
  Created by IntelliJ IDEA.
  User: huyhoanghoangicloud.com
  Date: 9/7/22
  Time: 20:18
  To change this template use File | Settings | File Templates.
--%>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
      integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
        crossorigin="anonymous"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>
        List product
    </title>
    <style>
        .add {
            padding: 10px;
            background-color: blue;
            color: white;
            text-decoration: none;
        }
        .add:hover{
            color: chartreuse;
        }
    </style>
</head>
<body>
<a class="add" href="/product?action=create">+ Add New Product</a>
<span>
    <form action="/product?action=search" method="post">
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
        <th>ID</th>
        <th>Name</th>
        <th>price</th>
        <th>quantity</th>
        <th>color</th>
        <th>Category</th>
        <th>ACTION</th>
    </tr>
    <c:forEach var="product" items="${listProduct}" varStatus="varStatus">
        <tr>
            <td>${varStatus.count}</td>
            <td>${product.id}</td>
            <td>${product.name}</td>
            <td>${product.price}</td>
            <td>${product.quantity}</td>
            <td>${product.color}</td>
            <c:forEach var="c" items="${categoryList}">
                <c:if test="${c.id == product.idCategory}">
                    <td>${c.nameCategory}
                    </td>

                </c:if>
            </c:forEach>
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

<!-- Modal Update-->
<div class="modal fade" id="exampleModalUpdate" tabindex="-1"
     aria-labelledby="exampleModalLabelUpdate"
     aria-hidden="true">
    <form action="/product?action=edit" method="post">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="exampleModalLabelUpdate">Edit Product</h5>
                    <button type="button" class="btn-close" data-bs-dismiss="modal"
                            aria-label="Close"></button>
                </div>
                <div class="modal-body">
                    <p>Do you want update product</p>
                    <div class="form-group">
                        <label for="productNameUpdate">Product Name</label>
                        <input type="text" name="productName" id="productNameUpdate" class="form-control"
                               placeholder="Input name">
                    </div>
                    <div class="form-group">
                        <label for="productPriceUpdate">Product price</label>
                        <input type="text" name="productPrice" id="productPriceUpdate" class="form-control"
                               placeholder="Input price">
                    </div>
                    <div class="form-group">
                        <label for="productQuantityUpdate">Product quantity</label>
                        <input type="text" name="productQuantity" id="productQuantityUpdate" class="form-control"
                               placeholder="Input quantity">
                    </div>
                    <div class="form-group">
                        <label for="productColorUpdate">Product color</label>
                        <input type="text" name="productColor" id="productColorUpdate" class="form-control"
                               placeholder="Input color">
                    </div>
                    <div class="form-group">
                        <label for="">Category</label>
                        <select name="idCategory">
                            <c:forEach var="cls" items="${categoryList}">
                                <option value="${cls.id}">${cls.nameCategory}</option>
                            </c:forEach>
                        </select>
                    </div>
                    <div>
                        <input type="hidden" name="productId" id="productIdUpdate">
                    </div>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close
                    </button>
                    <button type="submit" class="btn btn-primary">Save changes</button>
                </div>
            </div>
        </div>
    </form>
</div>


<script>
    function deleteInfo(id, name) {
        document.getElementById("idDelete").value = id;
        document.getElementById("deleteName").innerText = name;
    }

    $(".btn-update").click(function () {
        let id = $(this).attr("data-id");
        let name = $(this).attr("data-name");
        let price = $(this).attr("data-price");
        let quantity = $(this).attr("data-quantity");
        let color = $(this).attr("data-color");
        let idCategory = $(this).attr("data-idCategory");
        $("#productNameUpdate").val(name)
        $("#productPriceUpdate").val(price)
        $("#productQuantityUpdate").val(quantity)
        $("#productColorUpdate").val(color)
        $("#productIdUpdate").val(id)
        $("#productIdCategoryUpdate").val(idCategory)
        // $('#exampleModalUpdate').modal('show');
    })

</script>

</body>
</html>
