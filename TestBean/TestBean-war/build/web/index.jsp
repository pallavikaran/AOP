<%-- 
    Document   : index
    Created on : Aug 21, 2013, 11:26:40 AM
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
        <h1>My Calculator</h1>
        <form action="AddServlet" method="post">
            <h2>Enter Numbers:</h2>
            a: <input type="text" name="t1"/>
            <br>
            b: <input type="text" name="t2"/>
            <br>
            <input type="submit" value="Add"/>
            <input type="reset" value="Clear"/>
            
        </form>
    </body>
</html>
