<%--
  Created by IntelliJ IDEA.
  User: jeanette
  Date: 4/9/21
  Time: 10:24 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<jsp:include page="partials/head.jsp">
    <jsp:param name="title" value="Home Page"/>

</jsp:include>

<body>
<jsp:include page="partials/navbar.jsp">
    <jsp:param name="navBar" value="Home"/>
</jsp:include>
<h1 class="text-center">Welcome to the page!</h1>
</body>
</html>
