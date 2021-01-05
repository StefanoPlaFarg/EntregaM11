/**
 * 
 */
package com.main.persistence;

import java.util.ArrayList;
import java.util.List;

import com.main.domain.Flower;
import com.main.domain.Tree;

/**
 * @author stefano
 *
 */
public class TreeDao implements Dao<Tree> {
	
	
	private List<Tree> treesList = new ArrayList<>();

	public TreeDao() {

	}

	@Override
	public Tree get(int id) {

		return treesList.get(id);
	}

	@Override
	public void save(Tree tree) {
		treesList.add(tree);

	}

	@Override
	public void update(Tree tree, int id) {

		if (treesList.get(id) != null) {

			treesList.get(id).setPrice(tree.getPrice());
			treesList.get(id).setHeight(tree.getHeight());

		}

	}

	@Override
	public void delete(int id) {
		treesList.remove(id);
	}

	@Override
	public List<Tree> getAll() {
		return treesList;

	}

	@Override
	public void removeAll() {
		treesList.removeAll(treesList);
	}

}
