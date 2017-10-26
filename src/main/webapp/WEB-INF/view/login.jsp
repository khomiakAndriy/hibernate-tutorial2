<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html>
<head>
    <title>Login Page</title>

    <link href="${pageContext.request.contextPath}/resources/css/main.css" rel="stylesheet" type="text/css"/>


</head>
<body onload='document.f.j_username.focus();'>
<h3>MY Login with Username and Password</h3>
<form name='f' action='/j_spring_security_check' method='POST'>
    <table class="formtable">
        <tr>
            <td>User:</td>
            <td><input type='text' name='username' value=''></td>
        </tr>
        <tr>
            <td>Password:</td>
            <td><input type='password' name='password'/></td>
        </tr>
        <tr>
            <td>Remember me:</td>
            <td><input type='checkbox' name='_spring_security_remember_me'/>
        </tr>
        <tr>
            <td colspan='2'><input name="submit" type="submit"
                                   value="Login"/></td>
        </tr>
    </table>

    <p><a href="${pageContext.request.contextPath}/newaccount">Create account</a></p>
</form>
</body>
</html>

