<%--
  Created by IntelliJ IDEA.
  User: rraigonde
  Date: 2/1/2018
  Time: 6:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Admin page</title>
</head>
<body>
    Dear : <strong>${user}</strong> welcome to admin page
    <a href="<c:url value="/logout" />">Logout</a>
</body>
</html>
