package org.howard.edu.lsp.assignment3.implementation;

/**
 * used to direct to an exception with a customized message
 * @author OnyinyechukwuOgbuanya
 *
 */
public class IntegerSetException extends Exception {

	  /**
	 * 
	 */
	private static final long serialVersionUID = 7035980445904148530L;

	/**
	   * @param e -> thrown exception object/message
	   */
	  public IntegerSetException(String e) {
	    super(e);
	  }
}