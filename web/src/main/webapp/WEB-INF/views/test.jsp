<%@ page import="java.util.List" %>
<%@ page import="com.techpackservice.model.user.User" %><%--
  Created by IntelliJ IDEA.
  User: Asus
  Date: 3/3/2016
  Time: 9:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>TEST</title>
</head>
    <body>
        All users
        <%List<User> users = (List<User>) request.getAttribute("users");
        for (User user : users) {
        %>

        <%=user%>

        <%}%>
    </body>
</html>
