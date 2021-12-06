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

		int length = 0;
		int termCount = 0;
		String[] arrayPoly;
		String inputPoly;
		String coeff = "", expo = "";

    	inputPoly = fileReader.nextLine();
		arrayPoly = inputPoly.split(";");
		length = arrayPoly.length / 2;
		termCount = 0;
		System.out.println(inputPoly);
		for(int i = 0; i < length; i++) 
		{
			coeff = arrayPoly[termCount];
			termCount += 1;
			expo = arrayPoly[termCount];
			termCount += 1;
			poly.insert(new TheTermClass(Integer.parseInt(coeff), Integer.parseInt(expo)));
			System.out.println("coefficient: " + coeff + " ex: " + expo);
		}

		assertEquals("8 - 4x + 5x^2 ", poly.fullPoly());
		inputPoly = fileReader.nextLine();
		arrayPoly = inputPoly.split(";");
		length = arrayPoly.length / 2;
		termCount = 0;
		for(int i = 0; i < length; i++)
		{
			coeff = arrayPoly[termCount];
			termCount += 1;
			expo = arrayPoly[termCount];
			termCount += 1;
			poly.delete(Integer.parseInt(coeff), Integer.parseInt(expo));
		}

		assertEquals("8 -4x ", poly.fullPoly());
		assertEquals("100x^2", poly.product());
		
	}
	
}
