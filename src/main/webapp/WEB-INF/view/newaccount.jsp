<%@ page language="java" contentType="text/html; charset=US-ASCII"
         pageEncoding="US-ASCII" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

    <link href="${pageContext.request.contextPath}/resources/css/main.css" rel="stylesheet" type="text/css"/>

    <script type="text/javascript">
        var check = function () {
            if (document.getElementById('password').value == document.getElementById('confirmpass').value) {
                document.getElementById('message').style.color = 'green';
                document.getElementById('message').innerHTML = 'matching';
                document.getElementById('submit').disabled = false;
            } else {
                document.getElementById('message').style.color = 'red';
                document.getElementById('message').innerHTML = 'not matching';
                document.getElementById('submit').disabled = true;
            }
        }
    </script>
    <meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
    <title>Create New Account</title>
</head>
<body>


<h2>Create account</h2>

<sf:form method="post" action="${pageContext.request.contextPath}/createaccount" commandName="user">

    <table class="formtable">
        <tr>
            <td class="label">Username:</td>
            <td><sf:input class="control" path="username" name="username" type="text"/><br/><sf:errors path="username"
                                                                                                       cssClass="error"/>
            </td>
        </tr>
        <tr>
            <td class="label">Email:</td>
            <td><sf:input class="control" path="email" name="email" type="text"/><br/><sf:errors path="email"
                                                                                                 cssClass="error"/>
            </td>
        </tr>

        <tr>
            <td class="label">Password:</td>
            <td><sf:input class="control" path="password" id="password" name="password" type="password" onkeyup='check();'/>
                <br/><sf:errors
                    path="password"
                    cssClass="error"/>
            </td>
        </tr>
        <tr>
            <td class="label">Confirm Password:</td>
            <td><input class="control" name="confirmpass" id="confirmpass" type="password" onkeyup='check();'/>
                <span id='message'></span>
        </tr>
        <tr>
            <td class="label"></td>
            <td><input class="control" value="Create account" type="submit" id="submit" disabled/></td>
        </tr>
    </table>

</sf:form>

</body>
</html>