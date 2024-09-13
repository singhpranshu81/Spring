<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spring MVC</title>
</head>
<body>
    <h2>Welcome to Spring MVC !!!</h2>
    <%
        // Redirect to a mapped controller or URL in Spring MVC
        response.sendRedirect(request.getContextPath() + "/registerpage");
    %>
</body>
</html>