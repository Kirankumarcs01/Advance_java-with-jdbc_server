package org.svit.ipl_scoreboard;

import java.util.Scanner;
import java.security.Provider.Service;
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		System.out.println("Welcome to IPL Database");
		ipl_Services service = new ipl_Services();
		boolean flag = true;

		while (flag) {

			System.out.println("1.Add Team Data" + "\n");
			System.out.println("2.Update team Data" + "\n");
			System.out.println("3.Delete team Data" + "\n");
			System.out.println("4.Fetch team Data" + "\n");
			System.out.println("5.exit team Data" + "\n");
			System.out.println("Enter your choice");

			int n = scn.nextInt();

			switch (n) {

			case 1: {
				service.AddData();
				System.out.println("1.Add  Team Data" + "\n");
			}
				break;
			case 2: {

				service.UpdateData();
				System.out.println("2.Update team Data" + "\n");
			}
				break;
			case 3: {
				service.DeleteData();
				System.out.println("3.Delete team Data" + "\n");
			}
				break;
			case 4: {
				service.FetchData();
				System.out.println("4.Fetch team Data" + "\n");
			}
				break;
			case 5: {
				System.out.println("Do you want to Exit yes or no");
				char ch = scn.next().charAt(0);
				if (ch == 'y')
					flag = false;
				System.out.println("Thank you for using our application");
			}
				break;
			default:
				System.out.println("Invalid choice");
				break;

			}
		}

	}
	
}



