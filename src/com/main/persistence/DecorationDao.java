/**
 * 
 */
package com.main.persistence;

import java.util.ArrayList;
import java.util.List;

import com.main.domain.Decoration;
import com.main.domain.Tree;

/**
 * @author stefano
 *
 */
public class DecorationDao implements Dao<Decoration> {

	private List<Decoration> decorationsList = new ArrayList<>();

	public DecorationDao() {

	}

	@Override
	public Decoration get(int id) {

		return decorationsList.get(id);
	}

	@Override
	public void save(Decoration tree) {
		decorationsList.add(tree);

	}

	@Override
	public void update(Decoration decoration, int id) {

		if (decorationsList.get(id) != null) {

			decorationsList.get(id).setPrice(decoration.getPrice());
			decorationsList.get(id).setMaterial(decoration.getMaterial());

		}

	}

	@Override
	public void delete(int id) {
		decorationsList.remove(id);
	}

	@Override
	public List<Decoration> getAll() {
		return decorationsList;

	}

	@Override
	public void removeAll() {
		decorationsList.removeAll(decorationsList);
	}
	
	
	
}
