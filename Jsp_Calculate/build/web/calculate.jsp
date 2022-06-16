<%-- 
    Document   : calculate.jsp
    Created on : Apr 30, 2022, 5:39:06 PM
    Author     : Zin Ko Lin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page  %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%  
        
            int f , s, result= 0;
            
            String rdo;
            
            rdo = request.getParameter("r");
            
            f =Integer.parseInt( request.getParameter("f"));
            s =Integer.parseInt( request.getParameter("s"));
            

            if(rdo.equals("add")){
                
                result = f +s ;
                
            }
            
            if(rdo.equals("sub")){
                
                result = f -s ;
                
            }
            
            if(rdo.equals("div")){
                
                result = f * s ;
                
            }
            
            if(rdo.equals("mul")){
                
                result = f / s ;
                
            }
            

            out.println("the result is "+result);
            
            

            
            
            
        
        %>
        
        
    </body>
</html>
