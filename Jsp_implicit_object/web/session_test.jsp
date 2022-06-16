<%-- 
    Document   : session_test
    Created on : Apr 30, 2022, 5:13:41 PM
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
        <%
            session.setAttribute("user", "zin ko lyn");
        
        %>
        
        <a href="session_demo.jsp">Next </a>
        
        
        
    </body>
</html>
