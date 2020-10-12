<%-- 
    Document   : login
    Created on : Oct 11, 2020, 4:06:08 PM
    Author     : 832676
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>My Login</title>
    </head>
    <body>
        <h1>Login</h1>
         <form method="post" action="login">
       Username:<input type="text" name="userName" value=""><br>
       Password:<input type="text" name="Password" value=""><br>
            <input type="submit" value="Log in"> 
        </form>
        <p>${Message}</p>
    </body>
</html>
