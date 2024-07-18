<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"
	prefix="core"%>
<%@page isELIgnored="false"%>


<h1 style="color: red; text-align: center;">
	<a href="report">Get Employee Data</a>
</h1>
<br>
<br>

<h1 style="color: red; text-align: center;">welcome</h1>


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

			<core:forEach>
				<tr style="color:red">
				<td>${employees.employeeNo}</td>
				<td>${employees.employeeName}</td>
				<td>${employees.job}</td>
				<td>${employees.salary}</td>


				</tr>
			</core:forEach>

		</table>
	</core:when>

</core:choose>
