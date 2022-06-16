<%-- 
    Document   : Hello
    Created on : May 21, 2022, 6:28:59 PM
    Author     : Zin Ko Lin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/tlds/Mytaglib.tld" prefix="name" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% String str = request.getParameter("r"); 
            if(str.compareTo("g")==0){
                %>
                <name:HelloTag color="lightgreen">
                    <%= request.getParameter("n") %>
                </name:HelloTag>
            <%    
            }
            
             if(str.compareTo("y")==0){
                %>
                <name:HelloTag color="lightyellow">
                    <%= request.getParameter("n") %>
                </name:HelloTag>
            <%    
            }

             if(str.compareTo("b")==0){
                %>
                <name:HelloTag color="lightblue">
                    <%= request.getParameter("n") %>
                </name:HelloTag>
            <%    
            }

             if(str.compareTo("red")==0){
                %>
                <name:HelloTag color="lightred">
                    <%= request.getParameter("n") %>
                </name:HelloTag>
            <%    
            }

        %>
        
       
    </body>
</html>
