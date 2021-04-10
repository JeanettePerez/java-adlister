<%@ page import="java.util.List" %>
<%@ page import="userInfo.Contact" %>
<%@ page import="java.util.Arrays" %>
<%@ page import="java.util.ArrayList" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<jsp:include page="partials/head.jsp">
    <jsp:param name="title" value="Contacts"/>
</jsp:include>
<body>

<jsp:include page="partials/navbar.jsp">
    <jsp:param name="navBar" value="Contacts"/>
</jsp:include>
<div class="container">

<c:forEach items="${contacts}" var="contact">
    <c:if test="${contact.isActive}">
<div class="row">
    <div class="card col-md my-5 py-3 mx-5 bg-dark" style="width: 22rem; color: darkcyan">
        <div class="card-header text-center">
            <h3>${contact.name}</h3>
        </div>
        <ul class="list-group list-group-flush">
            <li class="list-group-item">Email: ${contact.email}</li>
            <li class="list-group-item">Phone Number: ${contact.phoneNumber}</li>
        </ul>
    </div>
</div>
    </c:if>
</c:forEach>
</div>

</body>
</html>
