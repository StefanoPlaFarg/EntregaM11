/**
 * 
 */
package com.main.persistence;

import java.util.List;

import com.main.domain.Item;


/**
 * @author stefano
 *
 */
public interface Dao<T> {

    T get(int id);     
    
    void save(T t);
    
    void update(T t, int id);
    
    void delete(int i);
    
    List<T> getAll();
    
    void removeAll();
  
    
}
