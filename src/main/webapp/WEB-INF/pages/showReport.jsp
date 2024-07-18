<%@page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core"%>


<core:choose>
	<core:when test="${!empty employees}">
	<h1 align="center">Employee Report</h1>

		<table border="1" align="center" bgcolor="cyan">
			<tr>
				<th>empno</th>
				<th>empname</th>
				<th>job</th>
				<th>salary</th>
			</tr>

			<core:forEach var="emp" items="${employees}">
				<tr style="color: red">
					<td>${emp.employeeNo}</td>
					<td>${emp.employeeName}</td>
					<td>${emp.job}</td>
					<td>${emp.salary}</td>

				</tr>
			</core:forEach>

		</table>
	</core:when>

</core:choose>
