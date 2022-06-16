<%-- 
    Document   : xml_if
    Created on : Jun 11, 2022, 5:32:06 PM
    Author     : Zin Ko Lin
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <c:set var="bookinfo" >
                <books>
                  <book>
                      <name>Java SE</name>
                      <author>Jame Goseleng</author>
                      <price>90</price>
                  </book>

                  <book>
                      <name>Java EE</name>
                      <author>Matt</author>
                      <price>150</price>
                  </book>
              </books>
        </c:set>
    
    <x:parse xml="${bookinfo}"  var="result"></x:parse>
    
    <x:if select="$result/books/book[1]/price<100">
        book price is cheap
    </x:if>
    <x:if select="$result/books/book[1]/price>150">
        book price is expensive
    </x:if>
    
        <br><h5>next line....</h5>
          <x:if select="$result/books/book[2]/price<100">
        book price is cheap
    </x:if>
    <x:if select="$result/books/book[2]/price>=150">
        book price is expensive
    </x:if>


</body>
</html>
