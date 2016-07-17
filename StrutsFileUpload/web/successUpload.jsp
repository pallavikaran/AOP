<%-- 
    Document   : successUpload
    Created on : Sep 12, 2013, 4:16:11 PM
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
        <h1>Image Uploaded</h1>
        UserImage: <s:property value="userImage"/>
        <br>
        FileName: <s:property value="userImageContentType" />
        <br>
        <img src='<s:property value="userImageFileName"/>'/>
        
    </body>
</html>
