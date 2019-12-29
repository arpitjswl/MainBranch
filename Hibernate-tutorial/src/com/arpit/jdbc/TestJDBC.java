package com.arpit.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJDBC {

	public static void main(String[] args) {
		String jdbcUrl = "jdbc:mysql://localhost:3306/hb_student_tracker";
		String uName = "hbstudent";
		String password = "hbstudent";
		System.out.println("Starting to test JDBC");
		
		try{
			System.out.println("In try Connecting to DB" +jdbcUrl);
			Class.forName("com.mysql.cj.jdbc.Driver"); // Class forName Mysql
			Connection conn = DriverManager.getConnection(jdbcUrl,uName,password);
			
			System.out.println("connection succed");
		}
		catch (Exception e){
			e.printStackTrace();
		}

	}

}
