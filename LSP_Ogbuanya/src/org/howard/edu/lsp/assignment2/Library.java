package org.howard.edu.lsp.assignment2;

/* JAVA DOC
 * This program builds a class that will represent
 * each library, and manage a collection of books. 
 * 
 */
import java.util.ArrayList;
/**
 * Add the missing implementation (methods and data definitions) to this class
 * @author 12025
 *
 */
public class Library 
{

	private String address;
	private String hours = "Daily from 9am to 5pm";
	private ArrayList<Book> bookList = new ArrayList<>();
	
	/**
	 * Implement this Constructor
	 * @param libraryAddress - This is the library's address
	 * 
	 */
	public Library(String libraryAddress) {
		
		this.address = libraryAddress;
	}
	
	/**
	 * updates the library with a book
	 * @param book - a book from the Book class
	 */
	public void addBook(Book book) {
		
	
		bookList.add(book);
	}
	
	/**
	 * prints out the Library's opening hours
	 */	
	public void printOpeningHours() {
		
	
			System.out.println(hours);
	}
	
	/**
	 * prints out the address of the library
	 */
	public void printAddress() {
		
	
		System.out.println(address);
	}
	
	/**
	 * checks the library has any books available
	 * 
	 */ 
	public void printAvailableBooks() {
		
		if(bookList.size()== 0) {
			System.out.println("There are no books available.");
			return;
		}
		System.out.println("These are the available books: ");
		for(int i = 0; i < bookList.size(); i ++) {
			if(!(bookList.get(i).isBorrowed())) {
				System.out.println(bookList.get(i).getTitle());
			}
		}
	}
	
	/**
	 * @param bookTitle - This string stores the title of the book
	 *checks if the book the user wants to borrow is available
	 *
	 */
	public void borrowBook(String bookTitle) {
		
		for ( int i = 0; i < bookList.size(); i++) {
			if ( bookList.get(i).getTitle().equals(bookTitle)) {
				bookList.get(i).borrowed();
				return;
			}
		}
		System.out.println("This book is currently unavailable at this library");
	}
	
	/**
	 * @param bookTitle - This string stores the title of the book
	 * User's book returned to the library
	 * 
	 */
	

	public void returnBook(String bookTitle) {
		
		for (int i = 0; i < bookList.size(); i++) {
			if (bookList.get(i).getTitle().equals(bookTitle)) {
				bookList.get(i).returned();
				return;
			}
		}
		System.out.println("This book is currently unavailable at this library");
	}
	
	/**
	 * Create Two libraries
	 * @param args - strings
	 */
	
	public static void main(String[] args) { 
		
		Library firstLibrary = new Library("10 Main St.");
		Library secondLibrary = new Library("228 Liberty St.");
		
		// Add four books to the first library 
		firstLibrary.addBook(new Book("The Da Vinci Code")); firstLibrary.addBook(new Book("Le Petit Prince")); 
		firstLibrary.addBook(new Book("A Tale of Two Cities")); firstLibrary.addBook(new Book("The Lord of the Rings")); 
		// Print opening hours and the addresses 
		System.out.println("Library hours:");
		firstLibrary.printOpeningHours(); 
		System.out.println(); 
		System.out.println("Library addresses:"); 
		firstLibrary.printAddress(); 
		System.out.println("Library hours:");
		secondLibrary.printOpeningHours(); 
		System.out.println(); 
		System.out.println("Library addresses:"); 
		secondLibrary.printAddress(); 

		// Try to borrow The Lords of the Rings from both libraries System.out.println("Borrowing The Lord of the Rings:"); firstLibrary.borrowBook("The Lord of the Rings"); 
		firstLibrary.borrowBook("The Lord of the Rings"); secondLibrary.borrowBook("The Lord of the Rings"); 
		System.out.println(); 

		// Print the titles of all available books from both libraries System.out.println("Books available in the first library:"); firstLibrary.printAvailableBooks(); 
		System.out.println(); 
		System.out.println("Books available in the second library:"); secondLibrary.printAvailableBooks(); 
		System.out.println(); 

		// Return The Lords of the Rings to the first library 
		System.out.println("Returning The Lord of the Rings:"); firstLibrary.returnBook("The Lord of the Rings"); 
		System.out.println(); 
		   	 } 
}
	
