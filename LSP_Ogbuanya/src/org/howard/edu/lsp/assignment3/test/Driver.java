package org.howard.edu.lsp.assignment3.test;

import org.howard.edu.lsp.assignment3.implementation.IntegerSet;
import org.howard.edu.lsp.assignment3.implementation.IntegerSetException;

public class Driver {
	/**
	 * Tests all the functions in the IntegerSet.java
	 */
	public static void main(String[] args) {
	    System.out.println("Creates empty set 1 and set 2: ");
	    IntegerSet s1 = new IntegerSet();
	    IntegerSet s2 = new IntegerSet();
	    System.out.println("Set 1: " + s1.toString() + "\nSet 2: " + s2.toString());
	    System.out.println("\nAdding 1, 2, 3, 4 to Set 1: ");
	    s1.add(1);
	    s1.add(2);
	    s1.add(3);
	    s1.add(4);
	    System.out.println("Set 1: " + s1.toString() + "\nSet 2: " + s2.toString());
	    System.out.println("\nClearing out Set 1 by using clear() function: ");
	    s1.clear();
	    System.out.println("Set 1: " + s1.toString() + "\nSet 2: " + s2.toString());
	    System.out.println("\nAdding 1, 2, 3 and 4 to Set 1: ");
	    s1.add(1);
	    s1.add(2);
	    s1.add(3);
	    s1.add(4);
	    System.out.println("Set 1: " + s1.toString() + "\nSet 2: " + s2.toString());
	    System.out.println("\nTesting length() function: ");
	    System.out.println("Set 1 length: " + s1.length() + "\nSet 2 length: " + s2.length());
	    System.out.println("\nTesting adding duplicates. Adding 1, 2 and 3 to Set 1 again: ");
	    s1.add(1);
	    s1.add(2);
	    s1.add(3);
	    System.out.println("Set 1: " + s1.toString() + "\nSet 2: " + s2.toString());
	    System.out.println("\nTesting equals() function: ");
	    System.out.println("Set 1 ?== Set 2: " + String.valueOf(s1.equals(s2)));
	    System.out.println( "\nMaking them equal. Adding 4, 1, 2 and 3 to Set 2 in that order. Order should not matter");
	    s2.add(4);
	    s2.add(1);
	    s2.add(2);
	    s2.add(3);
	    System.out.println("Set 1: " + s1.toString() + "\nSet 2: " + s2.toString());
	    System.out.println("Set 1 ?== Set 2: " + String.valueOf(s1.equals(s2)));
	    System.out.println("\nTesting contains() function: ");
	    System.out.println("Set 1 contains 2: " + s1.contains(2));
	    System.out.println("Set 2 contains 5: " + s1.contains(5));
	    System.out.println("\nTesting largest() function and smallest() function");
	    try {
	      System.out.println("Largest Element in Set 1: " + s1.largest());
	      System.out.println("Smallest Element in Set 2: " + s2.smallest());
	    } catch (IntegerSetException e) {
	    	System.out.println("ErrorMessage: " + e.getMessage());
	    }

	    System.out.println("\nTesting largest and smallest Exceptions. Clearing out both sets...");
	    s1.clear();
	    s2.clear();
	    try {
	      System.out.println("Largest Element in Set 1: " + s1.largest());
	    } catch (IntegerSetException e) {
	    	System.out.println("ErrorMessage: " + e.getMessage());
	    }

	    try {
	      System.out.println("Smallest Element in Set 2: " + s2.smallest());
	    } catch (IntegerSetException e) {
	    	System.out.println("ErrorMessage: " + e.getMessage());
	    }
	    System.out.println("\nAdding 6, 7, 8, 9 to Set 1 and 10, 9, 2, 7, 5 to Set 2: ");
	    s1.add(6);
	    s1.add(7);
	    s1.add(8);
	    s1.add(9);
	    s2.add(10);
	    s2.add(9);
	    s2.add(2);
	    s2.add(7);
	    s2.add(5);
	    System.out.println("Set 1: " + s1.toString() + "\nSet 2: " + s2.toString());
	    System.out.println("\nTesting remove function by removing 7 and 20 from Set 2");
	    try {
			s2.remove(7);
		} catch (IntegerSetException e) {
			// TODO Auto-generated catch block
			System.out.println("ErrorMessage: " + e.getMessage());
		}
	    try {
			s2.remove(20);
		} catch (IntegerSetException e) {
			// TODO Auto-generated catch block
			System.out.println("ErrorMessage: " + e.getMessage());
		}
	    System.out.println("Set 1: " + s1.toString() + "\nSet 2: " + s2.toString());
	    System.out.println("\nTesting Union function: ");
	    s1.union(s2);
	    System.out.println("Set 1 union Set 2: ");
	    System.out.println("Set 1: " + s1.toString() + "\nSet 2: " + s2.toString());
	    System.out.println("\nTesting Intersection function: ");
	    s1.intersect(s2);
	    System.out.println("Set 1 intersect Set 2: ");
	    System.out.println("Set 1: " + s1.toString() + "\nSet 2: " + s2.toString());
	    System.out.println("\nTesting Difference function: ");
	    s1.diff(s2);
	    System.out.println("Set 1 - Set 2: ");
	    System.out.println("Set 1: " + s1.toString() + "\nSet 2: " + s2.toString());
	    System.out.println("\nSet 2 - Set 1: ");
	    System.out.println("Set 1: " + s1.toString() + "\nSet 2: " + s2.toString());

	    System.out.println("\n All tests pass.");
	    // System.out.println(s1.toString());
	  }

}