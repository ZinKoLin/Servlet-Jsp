<%-- 
    Document   : Authenticate_Customer
    Created on : May 7, 2022, 5:49:12 PM
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
            
        String id = request.getParameter("id");
        
        int cid = Integer.parseInt(id);
        
        String pwd = request.getParameter("pwd");
        
        if(cid== 123 && pwd.equals("jame")){
           out.println("Welcome");
        }
        else{
            %>
            <jsp:forward page="Error.jsp"></jsp:forward>
            <% 
                }
            
            %>
    </body>
</html>
