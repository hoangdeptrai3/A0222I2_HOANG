<%--
  Created by IntelliJ IDEA.
  User: huyhoanghoangicloud.com
  Date: 9/14/22
  Time: 17:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %><%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Them moi</title>
    <a href="/mat_bang">Back to list product</a>
    <c:if test="${mess!=null}">
        <p style="color: red">${mess}</p>
    </c:if>
</head>
<body>
<form action="/mat_bang?action=create" method="post">
    <%--    <pre> id     : <input type="text" name="id" id=""></pre>--%>
    <pre> ma mat bang   : <input type="text" name="maMB" ></pre>
    <pre> Dien Tich  : <input type="text" name="dienTich" > </pre>
    <pre> Trang thai: <input type="text" name="trangThai"></pre>
    <pre> Tang: <input type="text" name="tang"></pre>
    <pre>Loai van phong:  <select name="idloaiVP">
                     <c:forEach var="cls" items="${loaimbList}">
                         <option value="${cls.id}">${cls.name}</option>
                     </c:forEach>
                    </select></pre>
        <pre> mo ta chi tiet: <input type="text" name="mo_ta_chi_tiet"></pre>
        <pre> gia cho thue : <input type="text" name="gia_cho_thue"></pre>
        <pre> ngay bat dau : <input type="date" name="ngay_bat_dau"></pre>
        <button type="submit">Thêm mới</button>
</form>
</body>
</html>
