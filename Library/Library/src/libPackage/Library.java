package libPackage;

import java.util.Arrays;

public class Library extends Book{

		Book book = new Book ();
		
		public Library () {}
																				
		public Library(String bookTitle) {
		
		}
	
		
		public String address;
		
		public String[] firstLibrary = {"The DaVinci Code", "Le Petit Prince", 
					"A Tale of Two Cities", "The Lord of the Rings"};
			
		public Library secondLibrary;

		//need to make these^^ hold wht addBook sends
		
		public String[] addBook () {
			Book new_book = new Book();
			new_book.title = title;
						return(firstLibrary);
		}
		
	
		public void borrowBook(String string) {
		{System.out.println("You successfully borrowed The Lord of the Rings");}
		System.out.println("This book is not in the catalog");}
		
		public void addBook(Book book) 
		{
			book.title = title;
			return;
		}
		
		
		//print just the contents of first and THEN second
		//it's calling the library by the address value assigned to 
		//new instances of library
		
		
		public void printAvailableBooks() 
		{
		System.out.print(Arrays.toString(firstLibrary));
		System.out.print("This book isn't in the catalog");}
			
		public void returnBook(String getTitle){
			this.bookTitle = getTitle;
			System.out.println("You successfully returned The Lord of the Rings");}
	
		private static void printOpeningHours() {
			System.out.println("Libraries are open daily from 9am to 5pm.");}
		
		
		public void printAddress () {
		{
			System.out.println("10 Main St.");
		}
			System.out.println("228 Liberty St.");
		}
////////////////////////////////////////////////////////////////////////////////

		public static void main(String[] args) {
	        // Create two libraries
	        Library firstLibrary = new Library("10 Main St.");
	        Library secondLibrary = new Library("228 Liberty St.");
	  

	        // Add four books to the first library
	        firstLibrary.addBook(new Book("The Da Vinci Code"));
	        firstLibrary.addBook(new Book("Le Petit Prince"));
	        firstLibrary.addBook(new Book("A Tale of Two Cities"));
	        firstLibrary.addBook(new Book("The Lord of the Rings"));

	        // Print opening hours and the addresses
	        System.out.println("Library hours:");
	        printOpeningHours();
	        System.out.println();

	        System.out.println("Library addresses:");
	        firstLibrary.printAddress();
	        secondLibrary.printAddress();
	        System.out.println();

	        // Try to borrow The Lords of the Rings from both libraries
	        System.out.println("Borrowing The Lord of the Rings:");
	        firstLibrary.borrowBook("The Lord of the Rings");
	        firstLibrary.borrowBook("The Lord of the Rings");
	        secondLibrary.borrowBook("The Lord of the Rings");
	        System.out.println();

	        // Print the titles of all available books from both libraries
	        System.out.println("Books available in the first library:");
	        firstLibrary.printAvailableBooks();
	        System.out.println();
	        System.out.println("Books available in the second library:");
	        secondLibrary.printAvailableBooks();
	        System.out.println();

	        // Return The Lords of the Rings to the first library
	        System.out.println("Returning The Lord of the Rings:");
	        firstLibrary.returnBook("The Lord of the Rings");
	        System.out.println();

	        // Print the titles of available from the first library
	        System.out.println("Books available in the first library:");
	        firstLibrary.printAvailableBooks();
	    }} 



