<%-- 
    Document   : login
    Created on : Apr 24, 2022, 5:06:14 PM
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
        <form action="validate.jsp" method="post">
            UserName:<input type="text" name="user"><br><br>
            Password:<input type="password" name ="psw"><br><br>
            <input type="submit" value="login">
        </form>
    </body>
</html>
