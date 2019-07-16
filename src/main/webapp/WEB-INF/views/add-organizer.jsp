<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: ILIA
  Date: 10.07.2019
  Time: 20:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Organizer</title>
</head>
<body>
<h2>Add new Organizer</h2>

<spring:form modelAttribute="organizer" action="/add-organizer" method="post">
    <a>введите айди юзера</a>
    <label for="userId">user id</label>
    <spring:input path="userId" id="userId"/>
    <button type="submit">Submit</button>
</spring:form>
</body>
</html>
