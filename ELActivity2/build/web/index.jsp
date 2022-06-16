<%-- 
    Document   : index
    Created on : May 28, 2022, 4:06:01 PM
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
        
        <jsp:useBean id="emp"  class="pack.EmployeeBean">
            <jsp:setProperty name="emp" property="firstName" value="aung "></jsp:setProperty>
            <jsp:setProperty name="emp" property="lastName" value="aung "></jsp:setProperty>
            <jsp:setProperty name="emp" property="designation" value="CEO"></jsp:setProperty>
        </jsp:useBean>
       
        Frist Name:  ${emp.firstName}<br>
        Last Name: ${emp.lastName}<br>
        Designation:  ${emp.designation}<br>

        
    </body>
</html>
