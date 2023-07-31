package com.studentInformation;

public class StudentInformation {
		
	private int Enrollment;
	private String Name;
	private String Department;

	public int getEnrollment() {
		return Enrollment;
	}

	public void setEnrollment(int enrollment) {
		Enrollment = enrollment;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getDepartment() {
		return Department;
	}

	public void setDepartment(String department) {
		Department = department;
	}
		
	StudentInformation(int Enrollment, String Name, String Department){
		super();
		this.Enrollment = Enrollment;
		this.Name = Name;
		this.Department = Department;		
	}

	StudentInformation(){
		super();
	}
	
	
	@Override
	public String toString() {
		return "StudentInformation [Enrollment=" + Enrollment + ", Name=" + Name + ", Department=" + Department + "]";
	}
}
