<%-- 
    Document   : jsp_param
    Created on : May 7, 2022, 4:20:28 PM
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
        <h1>forward param</h1>
        <jsp:forward page="forwardparam_demo.jsp">
        <jsp:param name="salary" value="10000"></jsp:param>
        </jsp:forward>
    </body>
</html>
