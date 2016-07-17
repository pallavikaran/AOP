<%-- 
    Document   : contact
    Created on : Sep 3, 2013, 1:51:56 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form:form action="addContact.spring" method="POST">
            <form:label path="firstname">FirstName</form:label>
            <form:input path="firstname"/>
            <form:label path="lastname">LastName</form:label>
            <form:input path="lastname"/>
            <form:label path="email">email</form:label>
            <form:input path="email"/>
            <input type="submit" value="SUbmit"/>
            
        </form:form>
    </body>
</html>
