<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: ILIA
  Date: 12.07.2019
  Time: 16:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Event</title>
</head>
<body>
<spring:form modelAttribute="addEvents" action="/add-event" method="post">
    <label for="name">name of event</label>
    <spring:input path="name" id="name"/>
    <label for="name">Organizer Id</label>
    <spring:input path="organizer" id="organizer"/>
    <button type="submit">Submit</button>
</spring:form>
</body>
</html>
