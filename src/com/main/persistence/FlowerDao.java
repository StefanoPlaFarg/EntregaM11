/**
 * 
 */
package com.main.persistence;

import java.util.ArrayList;
import java.util.List;

import com.main.domain.Flower;
import com.main.domain.Item;

/**
 * @author stefano
 *
 */
public class FlowerDao implements Dao<Flower> {

	private List<Flower> flowersList = new ArrayList<>();

	public FlowerDao() {

	}

	@Override
	public Flower get(int id) {

		return flowersList.get(id);
	}

	@Override
	public void save(Flower flower) {
		flowersList.add(flower);

	}

	@Override
	public void update(Flower flower, int id) {

		if (flowersList.get(id) != null) {

			flowersList.get(id).setPrice(flower.getPrice());
			flowersList.get(id).setColour(flower.getColour());

		}

	}

	@Override
	public void delete(int id) {
		flowersList.remove(id);
	}

	@Override
	public List<Flower> getAll() {
		return flowersList;

	}

	@Override
	public void removeAll() {
		flowersList.removeAll(flowersList);
	}

}
