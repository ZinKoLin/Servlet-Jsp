<%-- 
    Document   : Static_EL
    Created on : May 22, 2022, 5:31:57 PM
    Author     : Zin Ko Lin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/WEB-INF/tlds/static_el_taglib.tld"  prefix="static"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP ELS Static method</title>
    </head>
    <body>
        
        ${static:caculate()}
        
    </body>
</html>
