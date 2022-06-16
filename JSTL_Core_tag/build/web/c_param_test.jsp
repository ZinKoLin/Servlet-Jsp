<%-- 
    Document   : c_param_test
    Created on : Jun 11, 2022, 4:40:23 PM
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
        <%= request.getParameter("myname")%>
    </body>
</html>
