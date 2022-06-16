<%-- 
    Document   : c_foreach
    Created on : May 28, 2022, 5:18:36 PM
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
        
        <c:forEach var="count" begin="1" end="5">
            The value is: <c:out value="${count}"></c:out><br>
        </c:forEach>
        
    </body>
</html>
