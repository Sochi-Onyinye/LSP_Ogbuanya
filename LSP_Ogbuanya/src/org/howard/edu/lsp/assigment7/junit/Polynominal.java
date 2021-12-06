package org.howard.edu.lsp.assigment7.junit;

import java.util.ArrayList;
import java.util.Collections;

import org.howard.edu.lsp.assigment7.TheTermClass;

/**
 * 
 * @author 12025
 *
 */
public class Polynominal {
		
	private ArrayList<TheTermClass> myList;
	
	/**
	 * constructor
	 */
	
	public Polynominal ()
	{
		myList = new ArrayList<TheTermClass>();
	}
	
	/**
	 * @param newTerm
	 * insert a term into the polynomial
	 */
	public void insert(TheTermClass newTerm)
	{
		if (myList.size() == 0 ) {
			myList.add(newTerm);
			return;
		}
		else if (myList.size() > 0 ) {
			for(int i = 0; i < myList.size(); i++)
			{
				if (newTerm.getExpo() < myList.get(i).getExpo()) {
					myList.add(i, newTerm);
					return;
				}
			}
		}
		
		myList.add(newTerm);
	}
	
	/**
	 * get the value of a term and convert it to a string
	 * @return all the terms of a polynomial as a single line string
	 */
	public String fullPoly()
	{
		String poly = "";
		for ( int i = 0; i < myList.size(); i++ )
		{
			if ( i == myList.size() - 1)
				poly += myList.get(i).toString();
			else {
			System.out.println(myList.get(i).toString());
			poly += myList.get(i).toString() + " + ";
			}
			
		}
		return poly;
	}
	
	/**
	 * 
	 * @param coeff the value of the coefficient of the term
	 * @param expo the value of the exponent of the term
	 * delete a term ( e.g 3x^4) from a polynomial 
	 */
	public void delete(int coeff, int expo)
	{
		String term;
		for ( int i = 0; i < myList.size(); i++ )
		{
			if (coeff == myList.get(i).getCoeff() && expo == myList.get(i).getExpo())
				myList.remove(i);
		}
		if (expo == 1)
			term = String.valueOf(coeff) + "x";
		if (expo == 0)
			term = String.valueOf(coeff) + "";
		if (coeff == 1 && expo == 1)
			term = "x";
		if (coeff == 1)
			term =  "x^" + expo;
		term = String.valueOf(coeff) + "x^" + expo + " ";
		System.out.println("The term: " + term + "has been deleted");
	}
	
	/**
	 * 
	 * @return string representation of a polynomial term
	 */
	public String product()
	{
		int coeff = 1;
		int expo = 0;
		for ( int i = 0; i < myList.size(); i++)
		{
			coeff *= myList.get(i).getCoeff();
			expo += myList.get(i).getExpo();
		}
		return new TheTermClass(coeff, expo).toString();
	}
	
	/**
	 * 
	 * @return string representation of full polynomial in reverse
	 * reverses a full polynomial e.g 3x^0 - 9x^1
	 */
	public String reverse()
	{
		Collections.reverse(myList);
		return toString();
	}
	
	/**
	 * 
	 * @param args this is mainly to test out the methods created 
	 * above.
	 */
	public static void main(String[] args)
	{
		Polynominal poly = new Polynominal();
		poly.insert(new TheTermClass(-8,0));
		poly.insert(new TheTermClass(-4,4));
		poly.insert(new TheTermClass(5,3));
		System.out.println(poly.fullPoly());
	}

}
