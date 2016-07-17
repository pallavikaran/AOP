<%-- 
    Document   : login
    Created on : Sep 12, 2013, 12:11:58 PM
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
        <s:form action="login" method="post">
            <s:textfield name="username" label="user" size="20" />
            <s:password name="password" label="pass" size="20"/>
            <s:submit method="execute" label="Submit" align="center"/>
        </s:form>
    </body>
</html>
