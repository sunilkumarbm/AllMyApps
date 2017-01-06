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
public class BSTBuilder {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        
        bst.insert(10);
        
        bst.insert(5);
        bst.insert(3);
        bst.insert(25);
        bst.insert(50);
        bst.insert(2);
        bst.insert(49);
        
        bst.insert(46);
        
        System.out.println("Inorder");
        System.out.println(bst.dfs(BinaryTree.Traverse.inorder));
        
        System.out.println("Pre order");
        System.out.println(bst.dfs(BinaryTree.Traverse.preorder));
        
        
        System.out.println("Post order");
        System.out.println(bst.dfs(BinaryTree.Traverse.postorder));
        
        
        System.out.println("BFS");
        System.out.println(bst.bfs());
        
        System.out.println("Height: " + bst.height());
        
        BinarySearchTree bst2 = new BinarySearchTree();
        bst2.insert(10);
        bst2.insert(6);
        bst2.insert(9);
        bst2.insert(11);
        
        System.out.println("height: " + bst2.height());
    }
}
