<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
 
    <s:head></s:head>
   
        <s:form action="loginS">
            <s:textfield key="userBean.username"/>
            <s:password key="userBean.password"/>
            <s:submit key="submit"/>
            <s:reset/>
        </s:form>
       
    
</html>
