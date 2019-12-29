<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<%!
public static Connection getConnection(){  
    Connection con=null;  
    try{  
        Class.forName("com.mysql.cj.jdbc.Driver");  
        con=DriverManager.getConnection("jdbc:mysql://localhost:7102/arpit","root","akd9360_");  
    }catch(Exception e){System.out.println(e);}  
    return con;  
}  

%>

<%

String url = "jdbc:mysql://localhost:7102/arpit";
String userName = "root";
String pass = "akd9360";
String sql = "Select * from employee where id = 105";
Connection conn = getConnection();
System.out.println("success");
Statement stmt = conn.createStatement();

ResultSet rs = stmt.executeQuery(sql);
System.out.print("before");
while (rs.next()){
	System.out.print("before");
	out.print(rs.getString(2));
}
	

%>







</body>
</html>