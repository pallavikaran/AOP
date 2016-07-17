<%-- 
    Document   : index
    Created on : Sep 4, 2013, 1:07:47 PM
    Author     : Administrator
--%>

<%@page import="service.Hello"%>
<%@page import="service.Hello_Service"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
        Hello_Service service=new Hello_Service();
        Hello h= service.getHelloPort();
        out.print(h.hello("Talentedge"));
        %>
    </body>
</html>
