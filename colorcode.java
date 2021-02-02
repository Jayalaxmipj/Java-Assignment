package assignment;
import java.util.Scanner;

public class colorcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the color code");
		String color=scan.nextLine();
		
		switch(color)
		{ 
		case "r":
			System.out.print("Red");
			break;
		case "b":
			System.out.print("Blue");
			break;
		case "g":
			System.out.print("Green");
			break;
		case "o":
			System.out.print("Orange");
			break;
		case "y":
			System.out.print("Yellow");
			break;
		case "w":
			System.out.print("White");
			break;
		default:
			
			System.out.println(false);
		  
		}
	}

}
