/**
 * 
 */
package com.main.domain;

/**
 * @author stefano
 *
 */
public class Flower extends Item {
	
	protected String colour;
	
	public Flower() {
		super();
	}
	
	public Flower (String colour) {
		this();
		this.colour=colour;		
	}

	/**
	 * @return the colour
	 */
	public String getColour() {
		return colour;
	}

	/**
	 * @param colour the colour to set
	 */
	public void setColour(String colour) {
		this.colour = colour;
	}
	

}
