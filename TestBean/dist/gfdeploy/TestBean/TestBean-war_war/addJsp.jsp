<%-- 
    Document   : addJsp
    Created on : Aug 21, 2013, 11:40:35 AM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%!
        
          int a,b,c;
        %>
        <%
               a=Integer.parseInt(request.getParameter("t1"));
               b=Integer.parseInt(request.getParameter("t2"));
               
               
        
        %>
    </body>
</html>
