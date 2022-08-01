package com.nischal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Update {
	
	public static void  main(String[] args) throws ClassNotFoundException, SQLException{
		Scanner sc = new Scanner(System.in);
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","root");
		
		String query = "update mytable set gpa = ?, email = ? where id = ?";
		
		System.out.println("Enter the id to be changed");
		int id =  sc.nextInt();
		System.out.println("Enter the gpa");
		double gpa = sc.nextDouble();
		System.out.println("Enter the emai");
		String email = sc.next();
		
		PreparedStatement ps = con.prepareStatement(query);
		
		ps.setDouble(1, gpa);
		ps.setString(2, email);
		ps.setInt(3, id);
		
		System.out.println(ps);
		
		ps.executeUpdate();
		
		con.close();
	}

}
