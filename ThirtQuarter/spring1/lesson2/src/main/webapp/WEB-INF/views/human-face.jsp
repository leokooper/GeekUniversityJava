<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: leokooper
  Date: 2019-05-21
  Time: 01:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Human View</title>
</head>
<body>
    <form:form action="humanResultForm" modelAttribute="human">
        Gender: 
        <form:select path="gender">
            <form:option value="Male" label="Male" />
            <form:option value="Female" label="Female" />
        </form:select>
        <br>
        Age: <form:input path="age" />
        <br>
        Name: <form:input path="name" />
        <br>
        Surname: <form:input path="surname" />
        <br>
        Race:
        <form:select path="race">
            <form:option value="European" label="European" />
            <form:option value="Nigroid" label="Nigroid" />
            <form:option value="American" label="American" />
        </form:select>
        <br>
        <input type="submit" value="Submit" />
    </form:form>
</body>
</html>
