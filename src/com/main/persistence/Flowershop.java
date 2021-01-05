/**
 * 
 */
package com.main.persistence;
import java.util.ArrayList;
import java.util.List;

import com.main.domain.*;


/**
 * @author stefano
 *
 */
public class Flowershop {

    private FlowerDao flowerRepository = new FlowerDao();
    private TreeDao treeRepository = new TreeDao();
    private DecorationDao decorationRepository = new DecorationDao();
	/**
	 * @return the flowerRepository
	 */
	public FlowerDao getFlowerRepository() {
		return flowerRepository;
	}
	/**
	 * @return the treeRepository
	 */
	public TreeDao getTreeRepository() {
		return treeRepository;
	}
	/**
	 * @return the decorationRepository
	 */
	public DecorationDao getDecorationRepository() {
		return decorationRepository;
	} 
	
	public String getStock () {
		
		String flowerstock = new String();
		String treestock = new String();
		String decorationstock = new String();
		String totalstock = new String();
		
		for (Tree tree : treeRepository.getAll()) {

			treestock = treestock + " " + tree.getId();

		}

		for (Flower flower : flowerRepository.getAll()) {

			flowerstock = flowerstock + " " + flower.getId();

		}

		for (Decoration decoration : decorationRepository.getAll()) {

			decorationstock = decorationstock + " " +decoration.getId();

		}
		
		totalstock= "STOCK:"+ "\n" + "TREES: " + treestock + "\n" + "FLOWERS: " + flowerstock + "\n" + "DECORATION: "+ decorationstock ;
		
		
		return totalstock;
	}
	
	
	public void deleteRepositories() {
		
		flowerRepository.removeAll();
		treeRepository.removeAll();
		decorationRepository.removeAll();
		
		
	}
	
	
	
}
