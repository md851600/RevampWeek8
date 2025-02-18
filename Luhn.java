package JavaInterview;
//relocated from Jenkins 10/11/2024 but how do import??
import java.util.ArrayList;
import base.Book;
import base.Product;
import test.BankAccount;

public class Luhn {
	//public class Luhn (String id, int code)
		//this stays above pub stat void
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// from \Documents\VOL 35\all-star_prog_sol 11/17/22
		
		   // static Scanner cin;
		// this class within the same base.package calls functions in book.java
		
		  Book b1 = new Book("  Finding bigf",0.99);
    	  Book b2 = new Book("Apollo 13", 19.99);
    	  System.out.println("Luhn: " + b1.genre); 
    	  System.out.println(b2.price);    // calling definitions in Luhn.java
    	 
    	  b1.printTitle();
    	  
    	  // Dec 6th late due to qinghua
    	      //  	  Banco user2 = new Banco ();
    	      	  
    	 //Dec 7 Juniors - ArrayList
    	      	  // cannot take primitive, need wrap it in class type e.g. byte = Byte
    	      	  // short = Short, int = Integer, float = Float, double = Double, char = Character
    	      	  ArrayList<String> names = new ArrayList<String>();
    	      	  names.add("john");
    	      	  names.add("Paul");
    	      	  names.add("Ringo");
    	      	  names.add("George");
    	      	 ArrayList<String> numbers = new ArrayList<String>();
    	      	System.out.println(names.get(1));
    	      	numbers.addAll(names);
    	      	numbers.remove(2);
    	      	numbers.add("seven");
    	      	numbers.add("ocho");
    	      	System.out.println(numbers+" May 22");
    	      	// Jan 2, MDJuniors exceptions start below
    	      	 Bank SECU = new Bank ("SE", "CU","800","secuorg",34.3, 11.26);
	          	 System.out.println(SECU.getClass());
    	      	 System.out.println(SECU.deposit(0.99));
    	      	 
    	      	Object citi = new Bank(); //constructor added by Debugger
    	      	System.out.println(citi.hashCode());
    	      	//((Banco) citi).doAdding(4,7);//cast per Debugger ->ClassCastException
    	      	String ct = citi.toString();		
    	      	System.out.println("object Citi  "+ct);
    	      	Object chase = new Banco("DC","Ed",25);
    	      	//Object cap = new BankAccount(); //.mcCusService;
    	      	chase.notifyAll();
    	      	System.out.println(chase.equals(citi));
    	    	System.out.println(ct.toUpperCase());
    	    	System.out.println(BankAccount.mcCusService);
    	    	
    	    	  Product  p1 = new Product("M&M", 5.99, 8);
    	    	  Product  p2 = new Product("Hershey", 2.99, 12);
    	    	  Product  p3 = new Product("M&M", 5.99, 8);
    	    	  Product  p4 = new Product("Reece", 12.99, 12);
    	    	  Product  p5 = new Product("M&M", 5.99, 8);
    	    	  Product  p6 = new Product("Motts", 2.99, 12);
    	    	  Product  p7 = new Product("M&M", 5.99, 8);
    	    	  Product  p8 = new Product("Lays", 2.99, 12);
    	    	  Product  p9 = new Product("M&M", 5.99, 8);
    	    	  Product  p10 = new Product("Doritos", 2.99, 12);
    	    	  Product  p11 = new Product("Kit", 5.99, 18);
    	    	  Product  p12 = new Product("Kat", 2.99, 2);
    	    	  
    	      	 VendingMachine m1 = new VendingMachine("serial111",4,3);
    	      	// Dec 8 preview - copy from Class Notes
    	      					System.out.println(m1);
    	      			
    	      			m1.addItem(p2, 0, 1);
    	      			m1.addItem(p3, 0, 2);
    	      			
    	      			m1.addItem(p4, 1, 0);
    	      			m1.addItem(p5, 1, 1);
    	      			m1.addItem(p6, 1, 2);
    	      			
    	      			m1.addItem(p7, 2, 0);
    	      			m1.addItem(p8, 2, 1);
    	      			m1.addItem(p9, 2, 2);
    	      			
    	      			m1.addItem(p10, 3, 0);
    	      			m1.addItem(p11, 3, 1);
    	      			m1.addItem(p12, 3, 2);
    	      			m1.purchase(2, 2);
    	      			System.out.println(m1.items[2][2]);   
    	       	 
    	      		}
   				  
	}

