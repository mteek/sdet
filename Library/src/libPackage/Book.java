package libPackage;

public class Book {

    String title;
    String getTitle;
    boolean rented = true;
    boolean isBorrowed = true;
    boolean borrowed = true;
    boolean returned;

    // Creates a new Book
    public Book() {
    }
    
	public Book(String title) {
		this.title = title;
		// TODO Auto-generated constructor stub
	}
	
	// Returns the title of the book
    public String getTitle() {
    	return (title);
        // Implement this method
    }

    // Marks the book as rented
    public void borrowed(boolean borrowed) {
    	this.borrowed= borrowed;
        // Implement this method
    }
   

    // Marks the book as not rented

    public boolean returned () {
		return true;
    	
    }
    
    public boolean rented () {
    	return true;
    }


   public boolean isBorrowed() {  ///isBorrowed = true not equal rented = true if both are true == true
	   if(isBorrowed != (returned)) {  ///if isB/true is equal to rented/true then true 
	   return false ;} 			///if isB/true is not equal to returned/false then false
	   else if(isBorrowed != (rented)) { ///if isB/true equal return/false then false
	   }return true;}
   	   
  
	   
   		
   
	   /// if(!title.equals("rented")) {
		 ///  return false; 
   /// Returns true if the book is rented, false otherwise
    

    
    public static void main(String[] arguments) {
        // Small test of the Book class
        Book example = new Book("The Da Vinci Code");
        
        System.out.println("Title (should be The Da Vinci Code): " + example.getTitle());
        
        System.out.println("Rented? (should be false): " + example.isBorrowed());
        
        example.rented();
        
        System.out.println("Rented? (should be true): " + example.isBorrowed());
        
        example.returned();
        
        System.out.println("Rented? (should be false): " + example.isBorrowed());
    }
} 