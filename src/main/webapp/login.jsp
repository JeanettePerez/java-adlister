<%--
  Created by IntelliJ IDEA.
  User: jeanette
  Date: 4/8/21
  Time: 3:41 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    if(request.getMethod().equalsIgnoreCase("post")) {
        String usernameInput = request.getParameter("username");
        String passwordInput = request.getParameter("password");

        if(usernameInput.equals("admin") && (passwordInput.equals("password")))
            response.sendRedirect("profile.jsp");

    }
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Login Page</h1>
<form method="post" action="login.jsp">
    <label for="username">Username</label>
    <input id="username" type="text" name="username">
    <br>
    <label for="password">Password</label>
    <input id="password" type="password" name="password">
    <button>submit</button>
</form>
</body>
</html>
