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
<jsp:include page="partials/head.jsp">
    <jsp:param name="title" value="Login Page"/>
</jsp:include>
<body>
<jsp:include page="partials/navbar.jsp">
    <jsp:param name="navBar" value="Login Page"/>
</jsp:include>
<div class="container text-center my-5">
    <form method="post" action="login.jsp">
        <div>
        <label for="username">Username</label>
        <input id="username" type="text" name="username">
        </div>
        <br>
        <div>
        <label for="password">Password</label>
        <input id="password" type="password" name="password">
        </div>
        <br>
        <div class="d-grid gap-2 col-6 mx-auto">
            <button class="btn btn-secondary" type="button">Submit</button>
        </div>
    </form>

</div>
</body>
</html>
