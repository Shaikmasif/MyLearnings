package com.jdbcproject.JDBCProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Demo {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/university101","root","Database@1234");
			
			Statement stmt = conn.createStatement();
			
			stmt.executeUpdate("insert into student values(101)");
			
			System.out.println(" inserted ");
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
