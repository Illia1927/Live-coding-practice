<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ILIA
  Date: 12.07.2019
  Time: 13:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Users</title>
</head>
<body>
<table border="1"  cellpadding="5">
    <th>User</th>
    <th>Email</th>
    <c:forEach items="${users}" var="user">
        <tr>
            <td>
                <a href="/user/${user.id}">
                    <c:out value="${user.firstName} ${user.lastName}"/>
                </a>
            </td>
            <td>
                <c:out value="${user.email}"/>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
