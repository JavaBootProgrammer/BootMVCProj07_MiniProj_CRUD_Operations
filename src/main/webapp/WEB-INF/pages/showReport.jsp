<%@ taglib uri="http://java.sun.com/jsp/jstl/core"
	prefix="core"%>
<%@page isELIgnored="false"%>


<h1 style="color: red; text-align: center;">
	<a href="report">Get Employee Data</a>
</h1>
<br>
<br>


<core:choose>

	<core:when test="{!empty employees}">

		<h1>Employee Report</h1>

		<table border="1" align="center" bgcolor="cyan">

			<tr style="color: red">
				<th>empno</th>
				<th>empname</th>
				<th>job</th>
				<th>salary</th>
			</tr>

			<core:forEach var="emp" items="${list}">
				<tr style="color:red">
				<td>${emp.employeeNo}</td>
				<td>${emp.employeeName}</td>
				<td>${emp.job}</td>
				<td>${emp.salary}</td>


				</tr>
			</core:forEach>

		</table>
	</core:when>

</core:choose>
