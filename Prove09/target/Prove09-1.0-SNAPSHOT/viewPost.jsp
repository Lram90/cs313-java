<%-- 
    Document   : viewPost
    Created on : Mar 1, 2017, 1:14:18 PM
    Author     : landon
--%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Discussion</title>
</head>
<body>

<div>
    Discussion:<br /><br />
   <c:forEach var="post" items="${discussion}">
    ${post}<br />;
</c:forEach>
    </div>

</body>
</html>