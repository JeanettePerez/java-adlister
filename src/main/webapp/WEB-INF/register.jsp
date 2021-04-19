<%--
  Created by IntelliJ IDEA.
  User: jeanette
  Date: 4/17/21
  Time: 3:29 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <jsp:include page="partials/head.jsp">
    <jsp:param name="title" value="registration"/>
  </jsp:include>
</head>
<body>
<jsp:include page="partials/navbar.jsp" />

<form method="POST" action="${pageContext.request.contextPath}/register">
  <div class="container"></div>
  <h1>Registration Form</h1>
    <div class="form-group">
      <label for="username">Username</label>
      <input id="username" type="text" name="username" placeholder="Enter username">
    </div>
    <div class="form-group">
      <label for="email">Email</label>
      <input id="email" name="email" type="text" placeholder="Enter email">
    </div>
    <div class="form-group">
      <label for="password">Password</label>
      <input id="password" name="password" type="password" placeholder="Enter password">
    </div>
<%--    <div class="form-group">--%>
<%--      <label for="confirmation">Confirm Password</label>--%>
<%--      <input id="confirmation" name="confirmation" type="password" placeholder="Please confirm Password">--%>
<%--    </div>--%>
    <input class="btn btn-primary" type="submit" value="Submit">
</form>
</body>
</html>
