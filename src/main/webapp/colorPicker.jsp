<%--
  Created by IntelliJ IDEA.
  User: jeanette
  Date: 4/12/21
  Time: 11:24 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/pickcolor" method="POST">
    <label for="choice">What is Your Favorite Color?</label>
    <input type="text" id="choice" name="choice">
    <button type="submit" name="submit">Submit</button>
</form>
</body>
</html>
