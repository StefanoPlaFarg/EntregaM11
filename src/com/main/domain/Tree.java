/**
 * 
 */
package com.main.domain;

/**
 * @author stefano
 *
 */
public class Tree extends Item {
	
	private double height=0;

	public Tree() {
		super();
	}
	
	public Tree (double height) {
		this();
		this.height=height;		
	}
	
	/**
	 * @return the height
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(double height) {
		this.height = height;
	}
	
	
	
	
	

}
