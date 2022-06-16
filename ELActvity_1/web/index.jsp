<%-- 
    Document   : index.jsp
    Created on : May 22, 2022, 5:59:35 PM
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
        <form action="TestParam.jsp" method="post">
              Name:<input type="text" name="name" ><br><br>
              EmpID:<input type="text" name="id"><br><br>
              First Launguage:<input type="text" name="lang"><br><br>
              Second Language:<input type="text" name="lang"><br><br>
              <input type="submit" value="Submit" name="btnSubmit">
        </form>
    </body>
</html>
