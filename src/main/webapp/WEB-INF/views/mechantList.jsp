<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<html>
<head>
</head>
<body>

</br>
<h3>Country List</h3>

    <table class="tg">
        <tr>
            <th width="80">Id</th>
            <th width="120">Country Name</th>
            <th width="120">Population</th>
            <th width="60">Edit</th>
            <th width="60">Delete</th>
        </tr>
        <c:forEach items="${listOfMerchants}" var="merchant">
            <tr>
                <td>${merchant.id}</td>
                <td>${merchant.abbName}</td>
                <td>${merchant.fullName}</td>
                <td><a href="<c:url value='${pageContext.request.contextPath}/merchant/updateCountry/${merchant.id}' />" >Edit</a></td>
                <td><a href="<c:url value='${pageContext.request.contextPath}/merchant/deleteCountry/${merchant.id}' />" >Delete</a></td>
            </tr>
        </c:forEach>
    </table>

</body>
</html>