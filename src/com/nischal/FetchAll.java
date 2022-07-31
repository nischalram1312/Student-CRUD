package com.nischal;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.sql.Statement;


public class FetchAll {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		
		
		List<Student> list = new ArrayList<Student>();
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","root");
		
		String query = "select * from mytable";
		
		Statement st = con.createStatement();
		
		ResultSet rs = st.executeQuery(query);
		
		int id=-1;
		String firstName="",lastName="",gender="",email="";
		Date dob=null;
		
		double gpa=0.0;
		
		while(rs.next()) {
			id = rs.getInt("id");
			firstName = rs.getString("first_name");
			lastName = rs.getString("last_name");
			dob = rs.getDate("date_of_birth");
			gender = rs.getString("gender");
			gpa = rs.getDouble("gpa");
			email = rs.getString("email");
			
			Student stu = new Student(id, firstName, lastName, dob, gender, gpa, email) ;
			list.add(stu);
		}
		
		//cant print the list here
		ListIterator<Student> listItr = list.listIterator(list.size());
        while(listItr.hasPrevious())
        {
            Student ele = listItr.previous();
            System.out.println(ele);
        }
		con.close();	
		
	}

}
