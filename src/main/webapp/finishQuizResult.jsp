<%--
  Created by IntelliJ IDEA.
  User: ahmed
  Date: 4/19/2019
  Time: 2:39 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Quiz Servlet Lab</title>
</head>
<body>
<form action="quiz" method="post">
    <h1>The Number Quiz</h1>
    <p>Your current score is ${quiz.score}.</p>
    <p>You have completed The Number Quiz, with a score ${quiz.score} out of ${quiz.size} .</p>
</form>
</body>
</html>
