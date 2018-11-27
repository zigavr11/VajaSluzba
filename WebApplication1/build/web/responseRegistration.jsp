<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%-- 
    Document   : responseRegistration
    Created on : Nov 25, 2018, 7:47:34 PM
    Author     : Ziga
--%>

<sql:update var="registerUser" dataSource="jdbc/Vaja">
    INSERT INTO User (name, number, email, password)
    VALUES ('<%= request.getParameter("username")%>', '<%= request.getParameter("number")%>', '<%= request.getParameter("mail")%>', '<%= request.getParameter("password")%>')
</sql:update>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>                              
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        Registration successful.
    </body>
</html>
