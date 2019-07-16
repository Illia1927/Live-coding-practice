<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ILIA
  Date: 10.07.2019
  Time: 16:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User</title>
    <title><c:out value="${user.firstName}"/></title>
</head>
<body>
<div>
    <h2>User Data</h2>
    <p>First Name: <c:out value="${user.firstName}"/></p>
    <p>Last Name: <c:out value="${user.lastName}"/></p>
    <p>Email: <c:out value="${user.email}"/></p>
    <br>
    <h2>User's events</h2>
    <a href="/add-event/?u_id=${user.id}">Create event</a>
    <table  border="1"  cellpadding="5">
        <thead>
        <th>Event's name</th>
        <th>Status</th>
        </thead>
        <tbody>
        <c:forEach items="${user.events.keySet()}" var="event">
            <tr>
                <td>
                    <a href="/event/${event.id}">
                        <c:out value="${event.name}"/>
                    </a>
                </td>
                <td>
                    <c:out value="${user.events.get(event).name}"/>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
    <a href="/all-users">back to all user</a>
</div>
</body>
</html>
