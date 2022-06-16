<%-- 
    Document   : welcome
    Created on : Apr 24, 2022, 5:11:28 PM
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

            String name, psw;
            name = request.getParameter("user");
            psw = request.getParameter("psw");

            if (name.equals("zinkolin") && psw.equals("123")) {

        %>
        <jsp:forward page="welcome.jsp"></jsp:forward>

        <%                 } else {

        %>
        <jsp:forward page="error.jsp"></jsp:forward>
        <%    }


        %>
    </body>
</html>
