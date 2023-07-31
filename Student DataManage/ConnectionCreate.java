package com.studentInformation;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionCreate {
	
	static Connection con;
	
	public static Connection create() {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Collage", "root", "Mysql@2023");
			
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
		return con;
		
	}

}
