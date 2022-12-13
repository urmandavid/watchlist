<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<h1>Welcome to your Watchlist!</h1>
<h2>The date and time is ${dateAndTime}</h2>

<c:forEach var="i" begin="1" end="5">
    <p>${i}</p>
</c:forEach>
