<%-- 
    Document   : bean_demo
    Created on : May 7, 2022, 3:55:58 PM
    Author     : Zin Ko Lin
--%>

<%@page import="demo.TestBean"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <jsp:useBean id="mybean" class="demo.TestBean"></jsp:useBean> 
        <jsp:setProperty name="mybean" property="name" value="James"></jsp:setProperty>
         <jsp:setProperty name="mybean" property="address" value="NY"></jsp:setProperty>
          <jsp:setProperty name="mybean" property="age" value="21"></jsp:setProperty>
          
          
          <jsp:getProperty name="mybean" property="name"></jsp:getProperty><br>
          <jsp:getProperty name="mybean" property="address"></jsp:getProperty><br>
          <jsp:getProperty name="mybean" property="age"></jsp:getProperty>
        
    </body>
</html>
