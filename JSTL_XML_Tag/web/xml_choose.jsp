<%-- 
    Document   : xml_choose
    Created on : Jun 11, 2022, 6:01:18 PM
    Author     : Zin Ko Lin
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>
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
    
    <x:parse xml="${bookinfo}" var="result"></x:parse>
    
    <x:choose>
        <x:when select="$result/books/book[1]/price<100">
            Book price is Cheap
        </x:when>
        <x:when select="$result/books/book[1]/price>=100">
            Book price is Expensive
        </x:when>
        <x:otherwise >Book not avilable</x:otherwise>
    </x:choose>
    </body>
</html>
