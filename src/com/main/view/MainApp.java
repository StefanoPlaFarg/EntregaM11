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
		
		Controller controller = new Controller();
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("How many items do you want to create?");		
		int count = Integer.parseInt(myObj.nextLine());
		
		for (int i =1;i<=count;i++ ) {
			controller.createItem();
		}
		
		controller.printStock();
		controller.deleteAllItems();
		

	}

}
