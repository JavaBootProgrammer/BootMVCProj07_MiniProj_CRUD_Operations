<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<h1 style="color: red; text-align: center;">
	Delete Employee
</h1>
<form:form modelAttribute="employee">
	<table align="center" bgcolor="gray">

		<tr>

			<td>Employee No
			<td><form:input path="employeeNo" readonly="true" /></td>
		</tr>
		<tr>

			<td>Employee name
			<td><form:input path="employeeName" readonly="true" /></td>
		</tr>
		<tr>
			<td>Employee job
			<td><form:input path="job" readonly="true" /></td>
		</tr>
		<tr>
			<td>Employee salary
			<td><form:input path="salary" readonly="true" /></td>
		</tr>
		<tr>
			<td>Employee dept
			<td><form:input path="dept" readonly="true" /></td>
		</tr>
		<tr>
			<td><input type="submit" value="Delete"></td>
			<td><input type="submit" value="cancel"></td>
		</tr>
	</table>



</form:form>
<center>
	<a href="./">home <img src="images/home.png" width="15px"
		height="15px">

	</a>
</center>