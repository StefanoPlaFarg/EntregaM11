package com.main.view;

import com.main.application.Controller;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author stefano
 *
 */
public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//creating the items
		Controller controller = new Controller();
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("How many items do you want to create?");		
		int count = Integer.parseInt(myObj.nextLine());
		
		for (int i =1;i<=count;i++ ) {
			controller.createItem();
		}
		
		//printing the stock
		System.out.println("The stock is:");
		System.out.println(controller.printStock());
		System.out.println("Comment: Every number is the id corresponging to an item of the flowershop and is unique");
		
		//deleting all items
		controller.deleteAllItems();
		

	}

}
