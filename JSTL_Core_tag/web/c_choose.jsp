<%-- 
    Document   : c_choose
    Created on : May 28, 2022, 4:57:39 PM
    Author     : Zin Ko Lin
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <c:set var="age" value="25" ></c:set>
        
        <c:choose>
            <c:when test="${age>40}">
                <c:out  value="You are Old"></c:out>
            </c:when>
            <c:when test="${age==40}">
                <c:out  value="You are adult "></c:out>
            </c:when>
            <c:when test="${age<40}">
                <c:out value="You are Young"></c:out>
            </c:when>
            <c:otherwise>
                <c:out value="input age number"></c:out>
            </c:otherwise>
        </c:choose>
        
        
    </body>
</html>
