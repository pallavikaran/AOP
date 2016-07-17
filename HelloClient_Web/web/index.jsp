<%-- 
    Document   : index
    Created on : Sep 4, 2013, 12:26:57 PM
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
        Hello_Service service= new Hello_Service();
        Hello h= service.getHelloPort();
        String str= h.hello("Ashita");
        out.print("<h2>"+h.hello("Ashita")+"</h2>");
       // Hello h=service.get
        %>
    </body>
</html>
