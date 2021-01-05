/**
 * 
 */
package com.main.domain;

/**
 * @author stefano
 *
 */
public class Decoration extends Item {

	private static String[] listMaterials = { "wood", "plastic" };
	private String material;

	public Decoration() {
		super();
	}

	public Decoration(String material) {

		if (material.equals(listMaterials[0]) || material.equals(listMaterials[1])) {

			this.material = material;
		} else {

			System.out.println(
					"Decoration created but this material is not possible. The assigned one has been wood by default");
			this.material = "wood";
		}

	}

	public Decoration(String material, double price) {
		super(price);
		if (material.equals(listMaterials[0]) || material.equals(listMaterials[1])) {

			this.material = material;
		} else {

			System.out.println(
					"Decoration created but this material is not possible. The assigned one has been wood by default");
			this.material = "wood";
		}

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
		if (material.equals(listMaterials[0]) || material.equals(listMaterials[1])) {

			this.material = material;
		} else {

			System.out.println(
					"Decoration created but this material is not possible. The assigned one has been wood by default");
			this.material = "wood";
		}

	}

	
}
