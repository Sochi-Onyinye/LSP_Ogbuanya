package org.howard.edu.lsp.assigment7;

/**
 * 
 * @author 12025
 *
 */
public class TheTermClass 
{
	private int coeff;
	private int expo ;
	
	/**
	 * term constructor
	 * @param coeff the value of the coefficient of the term
	 * @param expo the value of the exponent of the term
	 */
	
	public TheTermClass(int coeff, int expo)
	{
		this.coeff = coeff;
		this.expo = expo;
	};
	
	/**
	 * 
	 * @return the value of the coefficient of a term 
	 */
	
	public int getCoeff()
	{
		return coeff;
	};
	
	/**
	 * 
	 * @param coeff the value of the coefficient of the term
	 */
	public void setCoeff(int coeff)
	{
		this.coeff = coeff;
	};
	
	/**
	 * 
	 * @return the value of the exponent of a term 
	 */
	
	public int getExpo()
	{
		return expo;
	};
	
	/**
	 * 
	 * @param expo the value of the exponent of the term
	 */
	public void setExpo(int expo)
	{
		this.expo = expo;
	};
	
	/**
	 * @return the string representation of a term
	 */
	public String toString()
	{
		if (this.expo == 1)
			return this.coeff + "x";
		if (this.expo == 0)
			return this.coeff + "";
		if (this.coeff == 1 && this.expo == 1)
			return "x";
		if (this.coeff == 1)
			return "x^" + this.expo;
		return this.coeff + "x^" + this.expo + " ";
		
	};
	
	/**
	 * 
	 * @param args this is mainly to test out the methods created 
	 * above.
	 */
	public static void main(String[] args) {
		TheTermClass term = new TheTermClass(8,0);
		System.out.println(term.toString());
	}
	

}
