package libPackage;

import java.util.Scanner;

public class Book {

	
    String title;  //instance vars 
    boolean returned;
    
    String bookTitle; ///reference 

    // Creates a new Book
    public Book(String bookTitle) { ///this class Book has one argument
    	this.title = bookTitle;
    	this.bookTitle = bookTitle;///this constructor declares the class book
        // Implement this method
    }
   
    public Book() {
		// TODO Auto-generated constructor stub
	}

	// Marks the book as rented
    public void borrowed(String bookTitle) {
    	bookTitle = "rented";
       // Implement this method
    }
    
    public void rented() {
    	
    }
   
    // Marks the book as not rented
    public boolean returned() {
    	bookTitle = "not rented";
        // Implement this method
		return returned;
    }
   
    // Returns true if the book is rented, false otherwiseS
    public boolean isBorrowed() {
    	boolean rented = returned(); 
    	if(rented){
    	     System.out.println();
    	}else{
    	     System.out.println();
    	}
		return false;
    	
    	 //testing if it's rented() borrowed() or returned()
    	
    }
        // Implement this method
   
    // Returns the title of the book
    public String getTitle() {
    	return bookTitle;
        // Implement this method
    }

    public static void main(String[] arguments) {
        // Small test of the Book class
        Book example = new Book("The Da Vinci Code");
        System.out.println("Title (should be The Da Vinci Code): " + example.getTitle());
        System.out.println("Borrowed? (should be false): " + example.isBorrowed());
        example.rented();
        System.out.println("Borrowed? (should be true): " + example.isBorrowed());
        example.returned();
        System.out.println("Borrowed? (should be false): " + example.isBorrowed());
    }
} 