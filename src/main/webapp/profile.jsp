<%--
  Created by IntelliJ IDEA.
  User: jeanette
  Date: 4/8/21
  Time: 3:41 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%

    System.out.printf("<h1>Hello, %s%n", request.getParameter("username"));
%>
<html>
<jsp:include page="partials/head.jsp">
    <jsp:param name="title" value="Profile"/>
</jsp:include>
<body>
<jsp:include page="partials/navbar.jsp">
    <jsp:param name="navBar" value="Profile"/>
</jsp:include>
<h1>Hello There</h1>
</body>
</html>
