<%-- 
    Document   : index
    Created on : Sep 4, 2013, 2:55:25 PM
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
        <h1>Calculator</h1>
        <form action="Action" method="POST">
            No1: <input type="text" name="no1"/>
            <br>
            No2: <input type="text" name="no2"/>
            <br>
            <input type="submit" name="cal" value="add"/>
            <input type="submit" name="cal" value="sub"/>
            <input type="submit" name="cal" value="mul"/>
            <input type="submit" name="cal" value="div"/>
            
        </form>
    </body>
</html>
