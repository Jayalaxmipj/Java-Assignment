package oops_assignment;
import java.util.*;
public class AggEncap extends Customer{

	public static void main(String[] args)  
	{
		
		// TODO Auto-generated method stub
//		AddressAE a=new AddressAE();
//		a.setAddressline("1st main HSR Layout,");
//		a.setCity("Bangalore");
//		System.out.print(a.getAddressline());
//		System.out.println(a.getCity());
//		
//		Customer c=new Customer();
//		c.setCustomerName("jhon");
//		c.setAddressline("1st main HSR Layout,Bangalore");
//		System.out.println(c.getCustomerName());
//		System.out.println();
		
		Customer c= new Customer();
		c.setCustomerName("jhon");
		System.out.println(c.getCustomerName());
		
		
		AddressAE a=new AddressAE();
		a.setAddressline("bmt layout");
		System.out.println(a.getAddressline());
		a.setCity("bang");
		System.out.println(a.getCity());
		
	}

}
