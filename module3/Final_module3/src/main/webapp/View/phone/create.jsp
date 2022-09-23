<%--
  Created by IntelliJ IDEA.
  User: huyhoanghoangicloud.com
  Date: 9/14/22
  Time: 09:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>

    <title>Them moi</title>
    <a href="/phone">Back to list phone</a>
    <c:if test="${mess!=null}">
        <p style="color: red">${mess}</p>
    </c:if>
</head>
<body>

<form action="/phone?action=create" method="post">
    <%--    <pre> id     : <input type="text" name="id" id=""></pre>--%>
    <pre> name   : <input type="text" name="name" ></pre>
    <pre> price  : <input type="text" name="price" > </pre>
    <pre>Color:  <select name="id_color">
                     <c:forEach var="cls" items="${colorList}">
                         <option value="${cls.id_Color}">${cls.nameColor}</option>
                     </c:forEach>
                    </select></pre>
    <button type="submit">Thêm mới</button>
</form>
</body>
</html>
