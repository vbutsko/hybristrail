<%--
  Created by IntelliJ IDEA.
  User: wladek
  Date: 10/7/16
  Time: 01:36
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html>
<title>Stadium Details</title>
<body>
<h1>Stadium Details</h1>

Stadium Details for ${stadium.name}<br><br>
Capacity: ${stadium.capacity}<br>
Matches:<br>
<ul>
    <c:forEach var="match" items="${stadium.matches}">
        <li>${match.matchSummaryFormatted}</li>
    </c:forEach>
</ul>
<img src="${stadium.imageUrl}"/> <br/>
<a href="../stadiums">Back to Stadium Listing</a>
</body>
</html>