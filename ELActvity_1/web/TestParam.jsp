<%-- 
    Document   : TestParam
    Created on : May 22, 2022, 6:00:02 PM
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
        Name :${param.name}<br><br>
        EmpId: ${param.id}<br><br>
        First Language: ${paramValues.lang[0]}<br><br>
        Second Language:${paramValues.lang[1]}<br><br>
        Email: ${initParam.email}
        
    </body>
</html>
