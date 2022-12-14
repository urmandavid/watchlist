<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP List Movie Records</title>
</head>
<body>
<sql:setDataSource
        var="myDS"
        driver="org.postgresql.Driver"
        url="jdbc:postgresql://localhost:5432/imdb_movies"
        user="postgres" password="yrgoP4ssword"
/>

<sql:query var="listMovies" dataSource="${myDS}">
    SELECT title, year, genre, duration, director, rating FROM movies;
</sql:query>

<div align="center">
    <table border="1" cellpadding="5">
        <caption><h2>List of movies</h2></caption>
        <tr>
            <th>Title</th>
            <th>Year</th>
            <th>Genre</th>
            <th>Duration</th>
            <th>Director</th>
            <th>Rating</th>

        </tr>
        <c:forEach var="movie" items="${listMovies.rows}">
            <tr>
                <td><c:out value="${movie.title}" /></td>
                <td><c:out value="${movie.year}" /></td>
                <td><c:out value="${movie.genre}" /></td>
                <td><c:out value="${movie.duration}" /></td>
                <td><c:out value="${movie.director}" /></td>
                <td><c:out value="${movie.rating}" /></td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
