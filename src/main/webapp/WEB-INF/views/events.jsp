<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="C" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ILIA
  Date: 26.06.2019
  Time: 20:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Event</title>
</head>
<body>
<h2>All Users:</h2>

<jsp:useBean id="events" scope="request" type="java.util.List"/>
<c:forEach var="u" items="${events}">
    <h4>Name: <c:out value="${u.name}"/></h4>
    <h4>Users:</h4>
    <c:forEach var="r" items="${u.usersStatus.keySet()}">
        <h5>First name: ${r.firstName}</h5>
        <h5>Last name: ${r.lastName}</h5>
        <h5>Email: ${r.email}</h5>
        <h5>Password: ${r.password}</h5>
        <h2>Status: <c:out value="${u.usersStatus.get(r)}"/></h2>
    </c:forEach>
</c:forEach>
</body>
</html>
