<%-- 
    Document   : c_set
    Created on : May 28, 2022, 4:42:50 PM
    Author     : Zin Ko Lin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       
        <c:set  var="name" value="zkl" ></c:set>
        <c:set var="address" value="mlm"></c:set>
        
        <h2><c:out value="${name}"></c:out></h2>
        
    </body>
</html>
