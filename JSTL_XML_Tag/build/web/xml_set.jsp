<%-- 
    Document   : xml_set
    Created on : Jun 11, 2022, 5:20:43 PM
    Author     : Zin Ko Lin
--%>
<%@taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>
<%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <c:set var="bookinfo">
            <books>
              <book>
                  <name>Java SE</name>
                  <author>Jame Goseleng</author>
                  <price>100</price>
              </book>

              <book>
                  <name>Java EE</name>
                  <author>Matt</author>
                  <price>150</price>
              </book>
          </books>
        </c:set>
    
    <x:parse var="result" xml="${bookinfo}"></x:parse>
    
    <x:set var="price" select="$result/books/book[1]/price"></x:set>
    
    <x:out select="$price"></x:out>
    
        
    </body>
</html>
