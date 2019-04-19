<%--
  Created by IntelliJ IDEA.
  User: ahmed
  Date: 4/17/2019
  Time: 1:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Quiz Servlet Lab </title>
</head>
<body>
<form action="quiz" method="post">
    <h1>The Number Quiz</h1>
    <p>Your current score is ${quiz.score}.</p>
    <p>Guess the next number in the sequence.</p>
    <p>${ques.question}</p>
    <p>Your answer: <input name="answer"></p>
    <p><input type="submit" name="Submit"></p>
</form>
</body>
</html>
