package org.howard.edu.lsp.assignment3.implementation;

import java.util.ArrayList;
import java.util.Collections;
/**
 * Integer set is a class that contains a set of integer variables
 * @author OnyinyechukwuOgbuanya
 *
 */
public class IntegerSet {
	
	private ArrayList<Integer> set = new ArrayList<Integer>();

	// Default Constructor
	public IntegerSet() {
	}

	/**
	 * Clears the internal representation of the set
	 */
	public void clear() {
		set.clear();
	};
	
	/**
	 * its a getter function that gets the value of set
	 * @return set value
	 */
	public ArrayList<Integer> getSet() {
	    return set;
	  }

	/**
	 * Returns the length of the set
	 * @return the length of the set
	 */
	public int length() {
		return set.size();
	}; // returns the length

	/**
	 * Returns true if the set is empty, false otherwise
	 * @return true if the set is empty, false otherwise
	 */
	public boolean isEmpty() {
		return set.size() == 0;
	}; 
	
	/**
	 * Returns true if the 2 sets are equal, returns false if  otherwise;
	 * Two sets are equal if they contain all of the same elements in ANY order.
	 * @param b -> the IntegerSet to be compared
	 * @return a boolean that says if they are equal or not
	 */
	public boolean equals(IntegerSet b) {
		ArrayList<Integer> bSet = new ArrayList(b.getSet());
		Collections.sort(bSet);
		ArrayList<Integer> setDuplicate = new ArrayList(set);
		Collections.sort(setDuplicate);
		return setDuplicate.equals(bSet);
	}; 

	/**
	 * Returns true if the set contains the element, otherwise returns false
	 * @param value-> the element to check if in set
	 * @return if element is in set
	 */
	public boolean contains(int value) {
		return set.contains(value);
	};    

	/**
	 * Returns the largest element in the set; Throws a IntegerSetException if the set is empty 
	 * @return the largest element in set
	 * @throws IntegerSetException if set is empty
	 */
	public int largest() throws IntegerSetException {
		if(isEmpty()) {
			throw new IntegerSetException("This integer set is empty");
		}
		Integer largestElem = set.get(0);
		for(Integer element : set) {
			if(element > largestElem) largestElem = element;
		}
		
		return largestElem;
	}; 

	/**
	 * Returns the smallest element in the set; Throws a IntegerSetException if the set is empty
	 * @return the smallest element in set
	 * @throws IntegerSetException if set is empty
	 */
	public int smallest() throws IntegerSetException{
		if(isEmpty()) {
			throw new IntegerSetException("This integer set is empty");
		}
		Integer smallestElem = set.get(0);
		for(Integer element : set) {
			if(element < smallestElem) smallestElem = element;
		}
		
		return smallestElem;
	};

	/**
	 * Adds an item to the set or does nothing it already there	
	 * @param item-> item to be added to set
	 */
	public void add(int item) {
		if(!set.contains(item)) set.add(item);
	}; // adds item to s or does nothing if it is in set

	/**
	 *  Removes an item from the set or does nothing if not there
	 * @param item -> to be removed from set
	 * @throws IntegerSetException -> if set is empty
	 */
	public void remove(int item) throws IntegerSetException {
		if(isEmpty()) {
			throw new IntegerSetException("This integer set is empty");
		}else if(!set.contains(item)) {
			throw new IntegerSetException("This does not exist in this set");
		}
		set.remove(Integer.valueOf(item));
	};  //Throws aIntegerSetException if the set is empty

	/**
	 * Finds the union of two sets and makes the set that calls the function the value of the union
	 * @param b -> IntegerSet
	 */
	public void union(IntegerSet b) {
		ArrayList<Integer> bSet = new ArrayList(b.getSet());
		for(Integer element: bSet) {
			if(!set.contains(element)) set.add(element);
		}
		
	};

	/**
	 * Finds the intersection of two sets and makes the set that calls the function the value of the operation
	 * @param b -> IntegerSet
	 */
	public void intersect(IntegerSet b) {
		ArrayList<Integer> bSet = new ArrayList(b.set);
		ArrayList<Integer> setIntersection = new ArrayList();
		
		for (Integer element : bSet) {
			if(!setIntersection.contains(element)) {
				if(set.contains(element)) {
					setIntersection.add(element);
				}
			}
		}
		
		set.clear();
		for (Integer item : setIntersection) {
		      set.add(item);
		    }
	}; 

	/**
	 * Set difference, i.e., s1 –s2
	 * @param b -> IntegerSet that contains the set to be operated on
	 */
	public void diff(IntegerSet b) {
		ArrayList<Integer> bSet = new ArrayList(b.getSet());
		ArrayList<Integer> setDifference = new ArrayList();
		
		for (Integer element : set) {
			if(!bSet.contains(element)) setDifference.add(element);
		}
		
		set.clear();
		for (Integer item : setDifference) {
		      set.add(item);
		    }
	} // set difference, i.e. s1 - s2

	

	/**
	 * Return String representation of your set
	 */
	public String toString() {
		ArrayList<String> stringForm = new ArrayList<String>();
	    for (Integer item : set) {
	    	stringForm.add(String.valueOf(item));
	    }
	    return String.join(" ", stringForm);
	};	// return String representation of your set
	
}
