<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="bananafish.worldwar.HomeService" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
    <title>Hello Servlet</title>
</head>
<body style="height: 100%">
<div style="position: relative;top:50%;text-align: center">

<h1>Hello!<%= session.getAttribute("username")%></h1>
</div>
</body>
</html>