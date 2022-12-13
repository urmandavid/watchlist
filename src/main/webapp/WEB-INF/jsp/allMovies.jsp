<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<h1>Movies page</h1>

<ul>
<c:forEach items="${movies}" var="movie">
   <li>${movie}</li>
</c:forEach>
</ul>
