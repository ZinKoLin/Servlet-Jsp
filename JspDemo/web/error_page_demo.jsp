<%-- 
    Document   : error_page_demo
    Created on : Apr 30, 2022, 4:07:51 PM
    Author     : Zin Ko Lin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page isErrorPage="true" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h3>Your result was Error!</h3>
        
        <%=exception  %>
        
    </body>
</html>
