<%-- 
    Document   : erropage
    Created on : Apr 30, 2022, 4:06:57 PM
    Author     : Zin Ko Lin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@page errorPage="error_page_demo.jsp" %>




<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <% 
             int a,b,c;
             
             a= 21;
             b=0;
             c = a/b;
             
            out.println(c);
        
        %>
        
        
        
        
        
    </body>
</html>
