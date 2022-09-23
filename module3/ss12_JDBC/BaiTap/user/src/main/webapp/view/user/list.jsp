<%--
  Created by IntelliJ IDEA.
  User: huyhoanghoangicloud.com
  Date: 9/4/22
  Time: 08:40
  To change this template use File | Settings | File Templates.
--%>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List user</title>
    <h1>User Management</h1>
    <a href="/user?action=create">Add New User</a>
</head>
<body>
<form action="user?action=search" method="post">
    <div class="form-group"
         style=";display: flex;align-items: center;justify-content: center;flex-direction: row">
        <input class="form-control me-2" style="width: 200px;margin: 1em" type="search" name="nameSearch"
               value="${nameSearch}" placeholder="Input name search " aria-label="Search">
        <input class="form-control me-2" style="width: 200px;margin: 1em" type="search" name="emailSearch"
               value="${emailSearch}" placeholder="Input email search" aria-label="Search">
        <input class="form-control me-2" style="width: 200px;margin: 1em" type="search" name="countrySearch"
               value="${countrySearch}" placeholder="Input country search" aria-label="Search">
        <button class="btn btn-outline-primary" type="submit">Search</button>
    </div>


</form>
<table class="table table-dark">
  <tr>
      <th>STT</th>
      <th>ID</th>
      <th>Name</th>
      <th>Email</th>
      <th>Country</th>
      <th>Actions</th>
  </tr>
<c:forEach var="User" items="${listUser}" varStatus="varStatus">
   <tr>
       <td>${varStatus.count}</td>
       <td><c:out value="${User.id}"/></td>
       <td><c:out value="${User.name}"/></td>
       <td><c:out value="${User.email}"/></td>
       <td><c:out value="${User.country}"/></td>
       <td>
           <!-- Button trigger modal update-->
           <button type="button" class="btn btn-outline-primary btn-update" onclick="onUpdate(this)"
                   data-id="${User.id}" data-name="${User.name}" data-email="${User.email}" data-country="${User.country}"
                   data-bs-toggle="modal"
                   data-bs-target="#exampleModalUpdate">
               Update
           </button>
           <button type="button" onclick="deleteInfo('${User.id}','${User.name}')" class="btn btn-danger"
                   data-bs-toggle="modal" data-bs-target="#exampleModal">
               Delete
           </button>
       </td>
   </tr>
</c:forEach>

</table>

<!-- Modal Update-->
<div class="modal fade" id="exampleModalUpdate" tabindex="-1"
     aria-labelledby="exampleModalLabelUpdate"
     aria-hidden="true">
    <form action="/user?action=edit" method="post">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="exampleModalLabelUpdate">Edit User</h5>
                    <button type="button" class="btn-close" data-bs-dismiss="modal"
                            aria-label="Close"></button>
                </div>
                <div class="modal-body">
                    <p>Do you want update user</p>
                    <div class="form-group">
                        <label for="userNameUpdate">User Name</label>
                        <input type="text" name="userName" id="userNameUpdate" class="form-control"
                               placeholder="Input name">
                    </div>
                    <div class="form-group">
                        <label for="userEmailUpdate">User Email</label>
                        <input type="text" name="userEmail" id="userEmailUpdate" class="form-control"
                               placeholder="Input email">
                    </div>
                    <div class="form-group">
                        <label for="userCountryUpdate">User Country</label>
                        <input type="text" name="userCountry" id="userCountryUpdate" class="form-control"
                               placeholder="Input country">
                    </div>
                    <div>
                        <input type="hidden"  name="userId" id="userIdUpdate">
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


<!-- Modal delete -->
<div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <form action="/user" method="post">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="exampleModalLabel">Modal title</h5>
                    <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                </div>
                <div class="modal-body">
                    <input hidden name="deleteId" id="deleteId">
                    <input hidden name="action" value="delete">
                    <span>Bạn có muốn xoá user </span><span id="deleteName"></span><span> Không?</span>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
                    <button type="submit" class="btn btn-primary">OK</button>
                </div>
            </div>
        </form>
    </div>
</div>

<script>
    function deleteInfo(id, name) {
        document.getElementById("deleteId").value = id;
        document.getElementById("deleteName").innerText = name;
    }
    $(".btn-update").click(function () {
        let id = $(this).attr("data-id");
        let name = $(this).attr("data-name");
        let email = $(this).attr("data-email");
        let country = $(this).attr("data-country");
        $("#userNameUpdate").val(name)
        $("#userEmailUpdate").val(email)
        $("#userCountryUpdate").val(country)
        $("#userIdUpdate").val(id)
        // $('#exampleModalUpdate').modal('show');
    })

</script>
</body>
</html>
