<%-- 
    Document   : el_bean_demo
    Created on : May 22, 2022, 4:39:13 PM
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
        <jsp:useBean class="demo.Employee_bean" id="emp">
            
            <jsp:setProperty name="emp" property="name" value="Tun Tun"></jsp:setProperty>
            <jsp:setProperty name="emp" property="address" value="Yangon"></jsp:setProperty>
            
                <h1> Name :${emp.name}</h1>
                    <h1>address:${emp.address}</h1>

            
        </jsp:useBean>
    </body>
</html>
