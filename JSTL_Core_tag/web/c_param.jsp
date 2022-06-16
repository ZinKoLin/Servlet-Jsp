<%-- 
    Document   : c_param
    Created on : Jun 11, 2022, 4:38:15 PM
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
        
        
        
        <c:url value="/c_param_test.jsp" var="myurl">
            <c:param name="myname" value="zinkolin"></c:param>
        </c:url>
        
        <a href="${myurl}">go</a>
        
        
    </body>
</html>
