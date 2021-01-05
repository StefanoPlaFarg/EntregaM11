/**
 * 
 */
package com.main.application;

import com.main.persistence.Flowershop;
import java.util.Scanner;

/**
 * @author stefano
 *
 */
public class Controller {
	protected Flowershop flowershop = new Flowershop();
	Scanner myObj = new Scanner(System.in);

	public void createItem() {

		System.out.println("Which element do you want to create? (tree/flower/decoration)");
		String item = myObj.nextLine(); // Read user input

		if (item.equals("flower")) {
			double price;
			String colour;
			System.out.println("Which is the price?");
			price = Double.parseDouble(myObj.nextLine());
			System.out.println("Which is the colour?");
			colour = myObj.nextLine();
			flowershop.getFlowerRepository().save(ItemFactory.createFlower(price, colour));

		} else if (item.equals("tree")) {
			double price;
			double height;
			System.out.println("Which is the price?");
			price = Double.parseDouble(myObj.nextLine());
			System.out.println("Which is the height?");
			height = Double.parseDouble(myObj.nextLine());
			flowershop.getTreeRepository().save(ItemFactory.createTree(price, height));

		} else if (item.equals("decoration")) {
			double price;
			String material;
			System.out.println("Which is the price?");
			price = Double.parseDouble(myObj.nextLine());
			System.out.println("Which is the material?");
			material = myObj.nextLine();
			flowershop.getDecorationRepository().save(ItemFactory.createDecoration(price, material));

		} else {

			System.out.println(
					"it is not possible to create this item. Next time create one of these: (tree/flower/decoration)");

		}

	}
	
	
	public void deleteItem() {

		System.out.println("Which element do you want to delete? (tree/flower/decoration)");
		String item = myObj.nextLine(); // Read user input

		if (item.equals("flower")) {
			int id;
			System.out.println("Which id?");
			id = Integer.parseInt( myObj.nextLine());
			flowershop.getFlowerRepository().delete(id);
			
			

		} else if (item.equals("tree")) {
			int id;
			System.out.println("Which id?");
			id = Integer.parseInt( myObj.nextLine());
			flowershop.getTreeRepository().delete(id);
			

		} else if (item.equals("decoration")) {
			int id;
			System.out.println("Which id?");
			id = Integer.parseInt( myObj.nextLine());
			flowershop.getDecorationRepository().delete(id);

		} else {

			System.out.println(
					"it is not possible to delete this item. Next time select one of these: (tree/flower/decoration)");

		}

	}
	
		
	
	public String printStock () {
		
		return flowershop.getStock();
	}
	
	
	public void deleteAllItems() {
		
		flowershop.deleteRepositories();
		
	}

}

