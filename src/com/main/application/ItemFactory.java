/**
 * 
 */
package com.main.application;
import com.main.domain.*;

/**
 * @author stefano
 *
 */
public class ItemFactory {

	public static Item createItem (String typeItem) {
		
		if (typeItem.toLowerCase().equals("flower")) {
			
			return new Flower();
			
		}else if (typeItem.toLowerCase().equals("tree")) {
			return new Tree();
			
		}else if (typeItem.toLowerCase().equals("decoration")) {
			
			return new Decoration();
		}else {
			
			System.out.println("This element is not possible to create. Choose a: flower,tree or decoration");
			return null;
		}
		
	}
	
}
