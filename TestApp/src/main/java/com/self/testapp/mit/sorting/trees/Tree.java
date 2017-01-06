package com.self.testapp.mit.sorting.trees;

/**
 *
 * @author Sunil
 * @param <T>
 */
public interface Tree <T>{
    Node ROOT = null;
    public void insert (T data);
    public void delete (T data);
    public Node<T> search (T data);
}
