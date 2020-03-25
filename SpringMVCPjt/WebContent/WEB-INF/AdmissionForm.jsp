<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib prefix="form" uri= "http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<form:errors path="student12.*"></form:errors>
<h1>${defaul}</h1>

<form action="/SpringMVCPjt/submitAdmission.html" method="post">


<table>
	<tr> <td> Student Name : <input type="text" name = "name"></td></tr>
	<tr> <td> Student Hobby : <input type="text" name = "hobby"></td></tr>
	<tr> <td> Student Mobile : <input type="text" name = "mobile"></td></tr>
	<tr> <td> Student DOB : <input type="text" name = "date"></td></tr>
	<tr> <td> Student Skills : <input type="text" name = "skillsSet"></td></tr>
	
	<tr> <td> Student Address :</td></tr>
	
	<tr>
		<td> Street :  <input type="text" name = "address.street"></td>
		<td>City : <input type="text" name = "address.city"> </td>
		<td>State : <input type="text" name = "address.state"></td>
		
	</tr>
	
	

</table>


Submit : <input type="submit" value = "GO">
</form>




</body>
</html>