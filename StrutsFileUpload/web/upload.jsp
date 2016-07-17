<%-- 
    Document   : upload
    Created on : Sep 12, 2013, 3:25:07 PM
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
        <h1>File Uploading</h1>
        <s:form action="userImage" method="post" enctype="multipart/form-data">
            <s:file name="userImage" label="User Image" />
            <s:submit value="Upload" align="center" />
        </s:form>
    </body>
</html>
