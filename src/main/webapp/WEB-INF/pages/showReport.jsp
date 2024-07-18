<%@page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<h1>Employee Report</h1>

<c:choose>
	<c:when test="${!empty employees}">

		<table border="1" align="center" bgcolor="cyan">
			<tr>
				<th>empno</th>
				<th>empname</th>
				<th>job</th>
				<th>salary</th>
			</tr>

			<c:forEach var="emp" items="${employees}">
				<tr style="color: red">
					<td>${emp.employeeNo}</td>
					<td>${emp.employeeName}</td>
					<td>${emp.job}</td>
					<td>${emp.salary}</td>

				</tr>
			</c:forEach>

		</table>
	</c:when>

</c:choose>
