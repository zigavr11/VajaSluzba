<%-- 
    Document   : registracija
    Created on : Nov 25, 2018, 7:30:38 PM
    Author     : Ziga
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP</title>
    </head>
    <body>
        <div class="naslov"><h1>Registracija</h1></div>
        <div>
            <form action="responseRegistration.jsp">
                <div class="container" style="line-height:2">
                    <label for="username"><b>Username</b></label>
                    <input type="text" placeholder="Enter Username" name="username" required>
                    <br>
                    <label for="password"><b>Password</b></label>
                    <input type="password" placeholder="Enter Password" name="password" required>
                    <br>
                    <label for="username"><b>Telephone number</b></label>
                    <input type="text" placeholder="Enter Username" name="number" required>
                    <br>
                    <label for="username"><b>Email</b></label>
                    <input type="text" placeholder="Enter Username" name="mail" required>
                    <br>
                    <button type="submit">Register</button>
                </div>
            </form>
            <div>
                <button type="button" onclick="location.href = 'index.jsp';"> Back </button>
            </div>
        </div>
    </body>
</html>
