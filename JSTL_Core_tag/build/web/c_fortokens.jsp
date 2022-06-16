<%-- 
    Document   : c_fortokens
    Created on : May 28, 2022, 5:24:34 PM
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
        
        
        <c:forTokens items="php,java,python,C#,Dart" delims="a" var="language">
            
            <c:out value="${language}"></c:out><br>
            
        </c:forTokens>
    </body>
</html>
