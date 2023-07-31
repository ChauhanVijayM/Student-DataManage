package com.studentInformation;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("        Welcome to the Collage Data menagement Applicatin           \n\n\n");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			Thread.sleep(1500);
			System.out.println("Press 1 to Add data in Database.\n-----------------------------------------------\n");
			System.out.println("Press 2 to Delete data in Database.\n-----------------------------------------------\n");
			System.out.println("Press 3 to Read data in Database.\n-----------------------------------------------\n");
			System.out.println("Press 4 to Exit data in Application.\n-----------------------------------------------\n\n");
			
			System.out.print("Choose any one number : ");
			int userSelect = Integer.parseInt(br.readLine());
			
			System.out.println("==========================================\n");
			
			if(userSelect == 1) {
				
				System.out.print("Enter Student Enrollment Number : ");
				int Enrollment = Integer.parseInt(br.readLine());
				
				System.out.print("\nEnter Student Name : ");
				String Name = br.readLine();
				
				System.out.print("\nEnter Student Department Name : ");
				String Department = br.readLine();
				
				System.out.println("\n==========================================\n");
				
				StudentInformation st = new StudentInformation(Enrollment, Name, Department);

				boolean answer = DataManage.insertData(st);
				
				if(answer) {
					System.out.println("Your data adding successfull...\n");
				}
				else {
					System.out.println("SomeThing Goses to Wrong...\n");
				}
				
			}
			else if(userSelect == 2) {
				
				System.out.print("Enter Enrollment Number : ");
				int enroll = Integer.parseInt(br.readLine());
				
				System.out.println("\n==========================================\n");
				
				boolean res = DataManage.deleteData(enroll);
				
				if(res) {
					System.out.println("Your data deleting successfull...\n");
				}
				else {
					System.out.println("SomeThing Goses to Wrong...\n");
				}
				
			}
			else if(userSelect == 3) {
				
				DataManage.selectData();
				
				System.out.println("Your data is Complete....\n");
				
				System.out.println("\n==========================================\n");
				
			}
			else if(userSelect == 4) {
				System.out.print("L");
				Thread.sleep(300);
				System.out.print("o");
				Thread.sleep(300);
				System.out.print("a");
				Thread.sleep(300);
				System.out.print("d");
				Thread.sleep(300);
				System.out.print("i");
				Thread.sleep(300);
				System.out.print("n");
				Thread.sleep(300);
				System.out.print("g");
				Thread.sleep(300);
				System.out.print(".");
				Thread.sleep(300);
				System.out.print(".");
				Thread.sleep(300);
				System.out.print(".\n");
				Thread.sleep(3000);
				System.out.println("Your Process is Terminated ....... ");
				break;
			}
			else {
				
				break;
			}
			
		}	

	}

}
