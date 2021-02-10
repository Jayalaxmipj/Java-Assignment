package book_details;
import java.util.Scanner;
public class BookDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b=new Book();
		Engineering b1=new Engineering();
		Scanner s=new Scanner(System.in);
		System.out.println("enter book number");
		b.setBookNo(s.nextInt());
		System.out.println("enter book title");
		b.setTitle(s.nextLine());
		System.out.println("enter book author");
		b.setAuthor(s.nextLine());
		System.out.println("enter book price");
		b.setPrice(s.nextFloat());
		
		b1.print(b);
		
		
		

	}

}
