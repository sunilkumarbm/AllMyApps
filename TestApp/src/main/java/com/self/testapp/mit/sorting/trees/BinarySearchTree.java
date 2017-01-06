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
public class BinarySearchTree<T extends Integer> extends BinaryTree<T> {
    
    @Override
    public void insert(Integer data) {
        Node<T> newNode = new Node(data);
        size = size +1;
        
        if (this.ROOT == null) {
            this.ROOT = newNode;
        }
        else {
            Node start = this.ROOT;
            
            boolean leaf = false;
            while (leaf != true) {
                if (data <= (int) start.data) {
                    if (start.left == null) {
                        start.left = newNode;
                        leaf = true;
                    } else {
                        start = start.left;
                    }
                } else {
                    if (start.right == null) {
                        start.right = newNode;
                        leaf = true;
                    } else {
                        start = start.right;
                    }
                }
            }
        }
    }

    @Override
    public void delete(Integer data) {
        
    }
    
    private Node<T> searchSubTree (Node root, Integer data) {
        if (root == null) {
            return null;
        }
        if (data == root.data) {
            return root;
        } else if (data < (int)root.data) {
            return searchSubTree(root.left, data);
        } else {
            return searchSubTree(root.right, data);
        }
    }

    @Override
    public Node<T> search(Integer data) {
        return searchSubTree(ROOT, data);
    }
}
