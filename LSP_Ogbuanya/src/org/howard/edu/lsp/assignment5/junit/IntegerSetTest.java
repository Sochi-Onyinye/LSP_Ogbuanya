package org.howard.edu.lsp.assignment5.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.howard.edu.lsp.assignment3.implementation.IntegerSet;
import org.howard.edu.lsp.assignment3.implementation.IntegerSetException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class IntegerSetTest {
	
	static IntegerSet set1 = new IntegerSet();
	static IntegerSet set2 = new IntegerSet();
	
	@Test
	@DisplayName("Test case for the ToString function")
	void testToString() {
		
		String set1ToStr = set1.toString();
		
		assertEquals("41 2 67 89 100", set1ToStr );
	}

	
	@BeforeEach
	@Test
	@DisplayName("Test case for the testAdd function")
	void testAdd() {
		
		set1.add(41);
		set1.add(2);
		set1.add(67);
		set1.add(89);
		set1.add(100);
		
		set2.add(109);
		set2.add(91);
		set2.add(86);
		set2.add(79);
		set2.add(60);
		set2.add(50);
		set2.add(40);
		
		String set1ToStr = set1.toString();
		String set2ToStr = set2.toString();
		
		assertEquals("41 2 67 89 100", set1ToStr);
		assertEquals("109 91 86 79 60 50 40", set2ToStr);
	}
	
	@Test
	@DisplayName("Test case for the testRemove function")
	void testRemove(){
		
		String set1ToStr = new String();
		String set2ToStr = new String();
		String set3ToStr = new String();
		
		IntegerSet set3 = new IntegerSet();
		
		try {
			
			set1.remove(97);
			set1ToStr = set1.toString();
			
		} catch (IntegerSetException e) {
			
			set1ToStr = e.getLocalizedMessage();
			
		}
		
		try {
			
			set2.remove(50);
			
			set2ToStr = set2.toString();
			
		} catch (IntegerSetException e) {
			
			set2ToStr = e.getLocalizedMessage();
			
		}
		
		try {
			
			set3.remove(30);
			
			set3ToStr = set3.toString();
			
		} catch (IntegerSetException e) {
			
			set3ToStr = e.getLocalizedMessage();
			
		}
		
		assertEquals("This value does not exist in this set", set1ToStr);
		assertEquals("109 91 86 79 60 50 40", set2ToStr);
		assertEquals("This integer set is empty", set3ToStr);
	}
	
	@Test
	@DisplayName("Test case for the testEquals function")
	void testEquals() {
		
		IntegerSet set3 = new IntegerSet();
		IntegerSet set4 = new IntegerSet();
		IntegerSet set5 = new IntegerSet();
		
		set3.add(41);
		set3.add(2);
		set3.add(67);
		set3.add(86);
		
		set4.add(21);
		
		set5.add(10);
		set5.add(20);
		set5.add(30);
		set5.add(40);
		
		assertTrue(set1.equals(set3));
		assertFalse(set1.equals(set4));
		assertTrue(set1.equals(set5));
	}
	
	@Test
	@DisplayName("Test case for the testClear function")
	void testClear() {
		
		set1.clear();
		set2.clear();
		
		int set1Len = set1.length();
		int set2Len = set2.length();
		
		assertEquals(0, set1Len);
		assertEquals(0, set2Len);
	}
	
	
	
	@Test
	@DisplayName("Test case for the testLength function")
	void testLength() {
		
		int set1Len = set1.length();
		int set2Len = set2.length();
		
		assertEquals(3, set1Len);
		assertEquals(2, set2Len);
	}
	
	
	@Test
	@DisplayName("Test case for the testContains function")
	void testContains() {
		
		assertTrue(set1.contains(41));
		assertFalse(set1.contains(8));
	}
	
	@Test
	@DisplayName("Test case for the testLargest function")
	void testLargest() {
		
		IntegerSet set3 = new IntegerSet();
		
		String set1LargestElem = new String();
		String set3LargestElem = new String();
		
		try {
			
			set1LargestElem = String.valueOf(set1.largest());
			
		} catch (IntegerSetException e) {
			
			set1LargestElem = e.getLocalizedMessage();
			
		}
		
		try {
			
			set3LargestElem = String.valueOf(set3.largest());
			
		} catch (IntegerSetException e) {
			
			set3LargestElem = e.getLocalizedMessage();
			
		}
		
		assertEquals("100", set1LargestElem);
		assertEquals("This integer set is empty", set3LargestElem);
	}

	@Test
	@DisplayName("Test case for the testSmallest function")
	void testSmallest() {
		
		IntegerSet set3 = new IntegerSet();
		
		String set1SmallestElem = new String();
		String set3SmallestElem = new String();
		
		try {
			
			set1SmallestElem = String.valueOf(set1.smallest());
			
		} catch (IntegerSetException e) {
			
			set1SmallestElem = e.getLocalizedMessage();
			
		}
		
		try {
			
			set3SmallestElem = String.valueOf(set3.smallest());
			
		} catch (IntegerSetException e) {
			
			set3SmallestElem = e.getLocalizedMessage();
			
		}
		
		assertEquals("2", set1SmallestElem);
		assertEquals("This integer set is empty", set3SmallestElem);
	}

	@Test
	@DisplayName("Test case for the testUnion function")
	void testUnion() {
		
		IntegerSet set3 = new IntegerSet();
		
		set3.add(90);
		set3.add(65);
		
		set3.union(set1);
		
		String set3ToStr = set3.toString();
		
		assertEquals("90 65 41 2 67 89 ", set3ToStr);
		
	}

	@Test
	@DisplayName("Test case for the testIntersect function")
	void testIntersect() {
		
		IntegerSet set3 = new IntegerSet();
		
		set3.add(90);
		set3.add(65);
		set3.add(67);
		set3.add(89);
		
		set3.intersect(set1);
		
		String set3ToStr = set3.toString();
		
		assertEquals("67 89", set3ToStr);
		
	}

	@Test
	@DisplayName("Test case for the testDifference function")
	void testDifference() {
		
		IntegerSet set3 = new IntegerSet();
		
		set3.add(90);
		set3.add(65);
		set3.add(67);
		set3.add(89);
		
		set3.diff(set1);
		
		String set3ToStr = set3.toString();
		
		assertEquals("90 65", set3ToStr);
		
	}

	@Test
	@DisplayName("Test case for the IsEmpty function")
	void testEmpty() {
		
		IntegerSet set3 = new IntegerSet();
		
		set3.add(90);
		set3.add(65);
		set3.add(67);
		set3.add(89);
		
		set3.clear();
		
		boolean set3IsEmpty = set3.isEmpty();
		
		assertTrue(set3IsEmpty);
		
	}
	
}

	