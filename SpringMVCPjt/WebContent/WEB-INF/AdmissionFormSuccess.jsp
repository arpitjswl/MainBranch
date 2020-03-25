<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<h1>${defaul}</h1>


<table>

	<tr>
		<td>Name </td>
		<td> ${student12.name}</td>
	</tr>
	
	
	<tr>
		<td>Hobby </td>
		<td>${student12.hobby} </td>
	</tr>
	
	
	<tr>
		<td> Mobile</td>
		<td> ${student12.mobile}</td>
	</tr>
	
	
	<tr>
		<td>DOB </td>
		<td> ${student12.date}</td>
	</tr>
	
	
	<tr>
		<td> Skills</td>
		<td> ${student12.skillsSet}</td>
	</tr>

	<tr>
		<td> Skills</td>
		<td> ${student12.address.state}</td>
	</tr>
	
	<tr>
		<td> Skills</td>
		<td> ${student12.address.city}</td>
	</tr>
	
	<tr>
		<td> Skills</td>
		<td> ${student12.address.street}</td>
	</tr>
</table>

</body>
</html>