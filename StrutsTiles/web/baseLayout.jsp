<%-- 
    Document   : baseLayout
    Created on : Sep 12, 2013, 10:14:26 AM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>  <tiles:insertAttribute name="title" ignore="true"/>
        </title>
    </head>
    <body>
        
        <table border="1" cellspacing="2" cellpadding="2" align="center">
            <tr>
                <td heigh="50"><tiles:insertAttribute  name="header"/></td>
            </tr>
            <tr>
                <td height="250"><tiles:insertAttribute  name="menu"/></td>
                <td width="350"><tiles:insertAttribute  name="body"/></td>
            </tr>
            <tr>
                <td height="30" colspan="2"><tiles:insertAttribute  name="footer"/></td>
            </tr>
        </table>
    </body>
</html>
