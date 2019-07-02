<jsp:useBean id="human" scope="request" type="ru.leonchenko.spring.part1.entities.Human"/>
<%--
  Created by IntelliJ IDEA.
  User: leokooper
  Date: 2019-05-21
  Time: 02:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Human Form Result:</title>
</head>
<body>
    Gender: ${human.gender};
    <br>
    Age: ${human.age};
    <br>
    Name: ${human.name};
    <br>
    Surname: ${human.surname};
    <br>
    Race: ${human.race};
    <br>
</body>
</html>
