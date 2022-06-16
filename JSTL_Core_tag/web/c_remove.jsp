<%-- 
    Document   : c_remove
    Created on : May 28, 2022, 5:14:06 PM
    Author     : Zin Ko Lin
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <c:set var="name" value="Wa"></c:set>
        Name is :<c:out value="${name}"></c:out><br>
        
        <c:remove var="name"></c:remove>
        Name is :<c:out value="${name}"></c:out>
    </body>
</html>
