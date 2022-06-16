<%-- 
    Document   : Error
    Created on : May 7, 2022, 5:50:21 PM
    Author     : Zin Ko Lin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Exxception Occured</h1>
        
        <%=pageContext.getException() %>
    </body>
</html>
