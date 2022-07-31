package com.nischal;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import javax.xml.crypto.dsig.keyinfo.PGPData;

import com.mysql.cj.protocol.Resultset;

public class Fetch {
	
	

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		
		Scanner scanner = new Scanner(System.in);
		
	
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","root");
		
		
		String query = "select * from mytable where id=?";
		
		System.out.println("Enter the id to be fetched");
		int sno = scanner.nextInt();
		
		PreparedStatement ps = con.prepareStatement(query);
		
		ps.setInt(1, sno);
		
		System.out.println(ps);
		
		int id=-1;
		String firstName="",lastName="",gender="",email="";
		Date dob=null;
		double gpa=0.0;
		
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			id = rs.getInt("id");
			firstName = rs.getString("first_name");
			lastName = rs.getString("last_name");
			dob = rs.getDate("date_of_birth");
			gender = rs.getString("gender");
			gpa = rs.getDouble("gpa");
			email = rs.getString("email");
		
		}
		Student student = new Student(id, firstName, lastName, dob, gender, gpa, email) ;
		
		student.print();
		
		con.close();
		
	}

}
class Student{
	int id;
	String firstName;
	String lastName;
	Date dob;
	String gender;
	double gpa;
	String email;
	
	public Student(int id, String firstName, String lastName, Date dob, String gender, double gpa, String email) {
		this.id=id;
		this.firstName=firstName;
		this.lastName=lastName;
		this.dob=dob;
		this.gender=gender;
		this.gpa=gpa;
		this.email=email;
	}
	
	public void print() {
		System.out.println(this.id+" "+this.firstName+" "+this.lastName+" "+this.dob+" "+this.gender+" "+this.gpa+" "+this.email);
	}
	
}
