<%-- 
    Document   : c_if
    Created on : May 28, 2022, 4:51:05 PM
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
        <c:set var="salary" value="400"></c:set>
        
        <c:if test="${salary>400}" >
            <c:out value="Your Salary is So Much"></c:out>
        </c:if>
        <c:if test="${salary==400}">
            <c:out value="Your Salary is Good" ></c:out>
        </c:if>
         <c:if test="${salary<400}">
            <c:out value="Your Salary is less" ></c:out>
        </c:if>
    </body>
</html>
