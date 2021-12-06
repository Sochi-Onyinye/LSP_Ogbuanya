package org.howard.edu.lsp.assigment7;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.howard.edu.lsp.assigment7.junit.Polynominal;
import org.junit.jupiter.api.Test;

/**
 * 
 * @author 12025
 *
 */

class PolynominalTest {
	
	Polynominal poly = new Polynominal();
	Scanner fileReader;
	
	/**
	 * get the information in the inputFile
	 */
	PolynominalTest()
	{
		File myObj = new File("inputFile.txt");
		try
		{
			fileReader = new Scanner(myObj);
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Tests for the functions in the polynomial class
	 */

	@Test
	
	void testClass() {
		
		String[] arrayPoly;
		String inputPoly;
		int coeff;
		int expo;

		
    	inputPoly = fileReader.nextLine();
		arrayPoly = inputPoly.split(";");
		int termLength = arrayPoly.length / 2;
		int termCount = 0;
		
		System.out.println(inputPoly);
		
		for(int i = 0; i < termLength; i++) 
		{
			
			coeff = Integer.parseInt(arrayPoly[termCount]);
			termCount += 1;
			expo = Integer.parseInt(arrayPoly[termCount]);
			termCount += 1;
//			 System.out.println("coefficient: " + coeff + " ex: " + expo);
			poly.insert(new TheTermClass(coeff, expo));
			
			System.out.println(poly.fullPoly());
		}
		//Test
		assertEquals("8 + 4x + 5x^3 ", poly.fullPoly());
		
		inputPoly = fileReader.nextLine();
		arrayPoly = inputPoly.split(";");
		termLength = arrayPoly.length / 2;
		termCount = 0;
		
		for(int i = 0; i < termLength; i++)
		{
			coeff = Integer.parseInt(arrayPoly[termCount]);
			termCount += 1;
			expo = Integer.parseInt(arrayPoly[termCount]);
			termCount += 1;
			poly.delete(coeff, expo);
		}
		
		//Test
		assertEquals("8 + 4x", poly.fullPoly());
		assertEquals("32x", poly.product());
		
	}
	
}
