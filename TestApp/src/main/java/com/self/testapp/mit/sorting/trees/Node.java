/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.self.testapp.mit.sorting.trees;

/**
 *
 * @author Sunil
 */
public class Node <T> implements Cloneable{
    T data;
    Node left;
    Node right;
    
    public Node (T data) {
        this.data = data;
        
        this.left = null;
        this.right = null;
    }
    
    @Override
    public Node<T> clone () throws CloneNotSupportedException{
        return (Node)super.clone();
    }
    
    @Override
    public String toString () {
        return "{"
                + "data : " + this.data
                + "}";
    }
}
