<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <s:form action="customer.action" method="post" >
            <s:textfield name="name" label="name" size="20" />
            <s:textfield name="age" label="age" size="20" />
            <s:textfield name="email" label="email" size="20" />
            <s:textfield name="telephone" label="telephone" size="20" />
            <s:submit method="addCustomer" label="Submit" align="center" />
        </s:form>     
    </body>
</html>
