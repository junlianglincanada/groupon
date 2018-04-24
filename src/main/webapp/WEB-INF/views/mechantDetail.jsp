<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<html>
<head>
</head>
<body>
<form:form method="post" modelAttribute="merchant" action="${pageContext.request.contextPath}/merchant/addMerchant">
    <table>
        <tr>
            <th colspan="2">Add merchant</th>
        </tr>
        <tr>
            <form:hidden path="id" />
            <td><form:label path="abbName">abbName:</form:label></td>
            <td><form:input path="abbName" size="30" maxlength="30"></form:input></td>
        </tr>
        <tr>
            <td><form:label path="fullName">fullName:</form:label></td>
            <td><form:input path="fullName" size="30" maxlength="30"></form:input></td>
        </tr>
        <tr>
            <td><form:label path="address">address:</form:label></td>
            <td><form:input path="address" size="30" maxlength="30"></form:input></td>
        </tr>
        <tr>
            <td><form:label path="createDate">createDate:</form:label></td>
            <td><form:input path="createDate" size="30" maxlength="30"></form:input></td>
        </tr>
        <tr>
            <td><form:label path="employees">employees:</form:label></td>
            <td><form:input path="employees" size="30" maxlength="30"></form:input></td>
        </tr>

        <tr>
            <td colspan="2"><input type="submit"
                                   class="blue-button" /></td>
        </tr>
    </table>
</form:form>
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