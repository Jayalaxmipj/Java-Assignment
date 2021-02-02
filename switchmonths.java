package assignment;

import java.util.Scanner;

public class switchmonths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		//while(scan==1)
		//{
		System.out.println("enter the month code");
		int month=scan.nextInt();
		
		switch(month)
		{ 
		case 1:
			System.out.print("January");
			break;
		case 2:
			System.out.print("Febeuary");
			break;
		case 3:
			System.out.print("March");
			break;
		case 4:
			System.out.print("April");
			break;
		case 5:
			System.out.print("May");
			break;
		case 6:
			System.out.print("June");
			break;
		case 7:
			System.out.print("July");
			break;
		case 8:
			System.out.print("August");
			break;
		case 9:
			System.out.print("september");
			break;
		case 10:
			System.out.print("October");
			break;
		case 11:
			System.out.print("November");
			break;
		case 12:
			System.out.print("December");
			break;
		default:
			System.out.println(false);
		  
		}
	}

}
