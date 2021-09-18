package org.howard.edu.lsp.assignment2;
/*
 * Java Doc
 *  This Class represents a book in a library. The different methods specify the current state of
 *  our book. 
 */

/**
 * create objects for this class
 * @author 12025
 *
 */
public class Book 
{
	private String title; 
	private boolean borrowed = false; 

	/** Creates a new Book 
	 * 
	 * @param bookTitle - This string stores the title of the book. 
	 */
	public Book(String bookTitle) 
	{ 
		// Implement this method 
		this.title = bookTitle;
	}
		
	/** Marks the book as borrowed 
	 * 
	 */
	public void borrowed() 
	{ // Implement this method 
		this.borrowed = true;
	}
	/** Marks the book as not borrowed 
	 * 
	 */
	public void returned() 
	{ // Implement this method 
		this.borrowed = false; 
	}
	/** Returns true if the book is rented, false otherwise 
	 * 
	 * @return borrowed -  a boolean indicating if the book has been borrowed
	 */
	public boolean isBorrowed() 
	{ // Implement this method 
		return borrowed;
	}
	/** Returns the title of the book 
	 * 
	 * @return title - string.
	 */
	public String getTitle() 
	{ // Implement this method 
		return title;
	}


}
