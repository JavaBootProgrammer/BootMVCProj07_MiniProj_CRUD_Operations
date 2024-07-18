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
	
		<h1> Employee Report</h1>
		

	</core:when>

</core:choose>
