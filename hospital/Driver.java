package org.svit.hospital;
import java.security.Provider.Service;
import java.sql.Connection;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

				Scanner scn=new Scanner(System.in);
				System.out.println("Welcome to Doctor Database");
				DoctorService service=new DoctorService();
				boolean flag=true;
				
				while(flag)
				{
					
				
				
				System.out.println("1.Add Doctor Data"+"\n");
				System.out.println("2.Update Doctor Data"+"\n");
				System.out.println("3.Delete Doctor Data"+"\n");
				System.out.println("4.Fetch Doctor Data"+"\n");
				System.out.println("5.exit Doctor Data"+"\n");
				System.out.println("Enter your choice");
				
				int n=scn.nextInt();
				
				switch(n) 
				{
				
					case 1:{
						service.addData();
						System.out.println("1.Add Doctor Data"+"\n");
						}
						break;
					case 2:{
						
						service.UpdateData();
						System.out.println("2.Update Doctor Data"+"\n");
					}
						break;
					case 3:{
						service.DeleteData();
						System.out.println("3.Delete Doctor Data"+"\n");
					}
						break;
					case 4:{
						service.FetchData();
						System.out.println("4.Fetch Doctor Data"+"\n");
					}
					break;
					case 5:
					{
						System.out.println("Do you want to Exit yes or no");
						char ch = scn.next().charAt(0);
						if(ch=='y')
							flag=false;
							System.out.println("Thank you for using our application");
					}
						break;
					default:
						System.out.println("invalid number");
						break;
						
				}	
				}
				
			}

			

		

	}


