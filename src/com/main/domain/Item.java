/**
 * 
 */
package com.main.domain;

/**
 * @author stefano
 *
 */
public abstract class Item {

	private int id;
	private double price = 0;
	private static int COUNTER_ID = 1;

	public Item() {

		id = COUNTER_ID++;
	}

	public Item(double price) {
		this.price = price;
		id = COUNTER_ID++;
	}

	public int getId() {

		return id;

	}

	public double getPrice() {

		return price;

	}

	public void setPrice(double price) {

		this.price = price;

	}

}
