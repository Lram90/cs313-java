<%-- 
    Document   : newPost
    Created on : Mar 1, 2017, 1:13:28 PM
    Author     : landon
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome</title>
    </head>
    <body>
        <h1>Welcome ${username}!</h1>
        <br />
        <form method="post" action="createPost">
            <label for="newPost">Post:</label>
            <input type="textarea" id="newPost" name="newPost"></input>
            <br />
            <input type="text" id="uName" name="uName" value="${username}" style="visibility: collapse"</input>
            <input type="submit" value="Post" />
        </form>
        <a href="viewPost.jsp">Go to Posts</a>
    </body>
</html>