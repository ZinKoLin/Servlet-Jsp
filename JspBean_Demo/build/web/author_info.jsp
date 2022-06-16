<%-- 
    Document   : author
    Created on : May 8, 2022, 4:01:16 PM
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

        <jsp:useBean class="demo.AuthorInfo" id="author"></jsp:useBean>

        <jsp:setProperty name="author" property="name" value="jame"></jsp:setProperty>
        <jsp:setProperty name="author" property="address" value="USA"></jsp:setProperty>
        <jsp:setProperty name="author" property="city" value="Utica"></jsp:setProperty>
        <jsp:setProperty name="author" property="state" value="NY"></jsp:setProperty>
        <jsp:setProperty name="author" property="zip" value="11010"></jsp:setProperty>
        
        
        <%-- get properties
--%>

        <jsp:getProperty name="author" property="name"></jsp:getProperty><br><br>
        <jsp:getProperty name="author" property="address"></jsp:getProperty><br><br>
        <jsp:getProperty name="author" property="city"></jsp:getProperty><br><br>
        <jsp:getProperty name="author" property="state"></jsp:getProperty><br><br>
        <jsp:getProperty name="author" property="zip"></jsp:getProperty>






    </body>
</html>
