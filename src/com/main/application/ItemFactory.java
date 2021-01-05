/**
 * 
 */
package com.main.application;

import com.main.domain.Decoration;
import com.main.domain.Flower;
import com.main.domain.Item;
import com.main.domain.Tree;

/**
 * @author stefano
 *
 */
public class ItemFactory {

	public static Flower createFlower(double price, String colour) {

		return new Flower(colour, price);

	}
	
	public static Tree createFlower(double price, double height) {

		return new Tree(height, price);

	}
	
	 public static Decoration createDecoration(double price, String material) {

		return new Decoration(material, price);

	}
	
		
}
