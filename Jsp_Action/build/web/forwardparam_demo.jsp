<%-- 
    Document   : forwardparam_demo
    Created on : May 7, 2022, 4:24:27 PM
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
        <h1>Param and forward page</h1>
        <%=request.getParameter("salary")%>
    </body>
</html>
