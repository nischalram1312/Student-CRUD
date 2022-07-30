package com.nischal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Add {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException, ParseException {
		Scanner sc = new Scanner(System.in);
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","root");
		
		//prepared statement
		String query = "insert into mytable(id,first_name,last_name,date_of_birth,gender,gpa,email) values (?,?,?,?,?,?,?);";
		
		//input the variables to add.
		System.out.println("Enter id");
		
		
		//1
		int id = sc.nextInt();
		System.out.println("firstName");
		//2
		String firstName = sc.next();
		System.out.println("lastName");
		//3
		String lastName = sc.next();
		System.out.println("date(yyyy-mm-dd)");
		//4
		String dt = sc.next();
//		DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
//		Date dob = dateFormat.parse(dt);
		System.out.println("gender(M/F)");
		//5
		char gender = sc.next().charAt(0);
		System.out.println("gpa");
		//6
		float gpa = sc.nextFloat();
		System.out.println("email");
		//7
		String email = sc.next();
		
		//Input of prepared statement
		PreparedStatement ps = con.prepareStatement(query);
		ps.setInt(1, id);
		ps.setString(2, firstName);
		ps.setString(3, lastName);
		ps.setString(4, dt);
		ps.setString(5, String.valueOf(gender));
		ps.setFloat(6, gpa);
		ps.setString(7, email);
		
		//checking prepared statement
		System.out.println(ps);
		
		//
		ps.executeUpdate();			
		
		
		
	
	
}

}
