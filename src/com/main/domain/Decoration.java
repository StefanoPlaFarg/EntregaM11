/**
 * 
 */
package com.main.domain;

/**
 * @author stefano
 *
 */
public class Decoration extends Item {
	
	private String[] listMaterials= {"wood","plastic"};
	private String material;
	
	public Decoration() {
		super();
	}
	
	public Decoration (String material) throws Exception {
		
		  this.material=material;	
								
	}

	/**
	 * @return the listMaterials
	 */
	public String[] getListMaterials() {
		return listMaterials;
	}

	/**
	 * @return the material
	 */
	public String getMaterial() {
		return material;
	}

	/**
	 * @param material the material to set
	 */
	public void setMaterial(String material) {
		this.material = material;
	}

	
}
