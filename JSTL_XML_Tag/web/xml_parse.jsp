<%-- 
    Document   : xml_parse
    Created on : Jun 11, 2022, 5:01:54 PM
    Author     : Zin Ko Lin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>
<%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <c:import url="test.xml" var="bookinfo"></c:import>
        
        <x:parse xml="${bookinfo}" var="result"></x:parse>
        
        <x:out select="$result/books/book[1]/name"></x:out><br>
         <x:out select="$result/books/book[1]/author"></x:out><br>
         <x:out select="$result/books/book[1]/price"></x:out><br><br><br>
          
          <x:out select="$result/books/book[2]/name"></x:out><br>
         <x:out select="$result/books/book[2]/author"></x:out><br>
          <x:out select="$result/books/book[2]/price"></x:out><br>
        
    </body>
</html>
