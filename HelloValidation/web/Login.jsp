<%-- 
    Document   : Login
    Created on : Mar 14, 2012, 2:21:34 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <s:head/>
    <body>
        <s:form action="loginS">
            <s:textfield key="userBean.userName"/>
            <s:password key="userBean.password"/>
            <s:submit key="submit"/><s:reset/>
        </s:form>
    </body>
</html>
