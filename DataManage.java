package com.studentInformation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class DataManage {
	
	public static boolean insertData(StudentInformation st) {
		
		try {
			
			Connection con = ConnectionCreate.create();
			
			String query = "insert into student(EnrollmentNo, Name, Department) values(?,?,?)";
			
			PreparedStatement prpstm = con.prepareStatement(query);
			
			prpstm.setInt(1, st.getEnrollment());
			prpstm.setString(2, st.getName());
			prpstm.setString(3, st.getDepartment());
			
			prpstm.executeUpdate();
			
			return true;
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public static boolean deleteData(int id) {
		
		try {
			
			Connection con = ConnectionCreate.create();
			
			String delete = "delete from Student where EnrollmentNo = ?";
			
			PreparedStatement prpstmt = con.prepareStatement(delete);
			
			prpstmt.setInt(1, id);
			
			prpstmt.executeUpdate();
			
			return true;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public static void selectData() {
		
		try {
			
			Connection con = ConnectionCreate.create();
			
			String read = "select * from Student;";
			
			Statement st = con.createStatement();
			
			ResultSet result = st.executeQuery(read);
			
			System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n");
			
			while(result.next()) {
				int Enrollmentno = result.getInt(1);
				String Name = result.getString(2);
				String Department = result.getString(3);
				Thread.sleep(1000);
				System.out.println("Student Enrollment Number is : "+Enrollmentno);
				System.out.println("Student Name is : "+Name);
				System.out.println("Student Department Name is : "+Department);
				System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n");
			}
			Thread.sleep(1000);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
