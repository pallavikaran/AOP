<%-- 
    Document   : login
    Created on : Sep 13, 2013, 11:14:40 AM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <s:form action="login" method="POST">
            
            <s:textfield key="labeluser" />
            <s:password key="labelpass" />
            <s:submit value="Submit"/>
        </s:form> 
    </body>
</html>
