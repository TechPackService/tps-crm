<%@ page import="com.techpackservice.crm.entity.User" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>TestJSP</title>
</head>
<body>
<%Iterable<User> users = (Iterable<User>) request.getAttribute("users");%>
<ul>
<%for (User user : users) {%>
    <li><%=user%></li>
<%}%>
</ul>
<form action="/test" method="post">
    <p><input type="login" name="login"></p>
    <p><input type="password" name="password"></p>
    <p><input type="submit" value="submit"></p>
</form>
</body>
</html>
