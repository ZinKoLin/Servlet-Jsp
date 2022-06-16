<%-- 
    Document   : session_demo
    Created on : Apr 30, 2022, 5:14:00 PM
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
          String name ;  
            name =(String) session.getAttribute("user");
            
            out.println(name);
            
        %>
    </body>
</html>
