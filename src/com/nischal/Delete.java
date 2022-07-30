package com.nischal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.jdbc.Driver;

public class Delete {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","root");
		
		
		String query = "delete from mytable where id=?";
		
		System.out.println("enter id to be deleted");
		
		int id = sc.nextInt();
		
		PreparedStatement ps = con.prepareStatement(query);
		
		ps.setInt(1, id);
		
		System.out.println(ps);
		
		ps.executeUpdate();
		
		con.close();
	}

}
