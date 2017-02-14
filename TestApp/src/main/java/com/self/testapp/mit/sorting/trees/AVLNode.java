/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.self.testapp.mit.sorting.trees;

/**
 *
 * @author Sunil
 * @param <T>
 */
public class AVLNode<T> extends Node<T> {
    int height = 0;
    public AVLNode (T data) {
        super(data);
    }
}
