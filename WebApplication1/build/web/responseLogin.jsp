<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%-- 
    Document   : responseLogin
    Created on : Nov 25, 2018, 7:39:16 PM
    Author     : Ziga
--%>
<sql:query var="user" dataSource="jdbc/Vaja">
    SELECT name,password,number,email
    FROM user 
    WHERE name=? <sql:param value="${param.username}"/> AND password=? <sql:param value="${param.password}"/> 
</sql:query>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login response</title>
    </head>
    <body>
        <c:if test = "${user.rowCount == 0}">
            Wrong username or password, please try again.
            <a href="login.jsp">Back to login screen</a>
        </c:if>
        <c:if test = "${user.rowCount > 0}">
            <c:forEach var="row" items="${user.rowsByIndex}">
                Name:<c:out value="${row[0]}"/><br>
                Password:<c:out value="${row[1]}"/><br>
                Telephone:<c:out value="${row[2]}"/><br>
                Email:<c:out value="${row[3]}"/>
            </c:forEach>  
        </c:if>
    </body>
</html>
