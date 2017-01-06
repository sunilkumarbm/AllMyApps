/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.self.testapp.mit.sorting.trees;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 *
 * @author Sunil
 * @param <T>
 */
public abstract class BinaryTree<T> implements Tree<T> {

    protected Node <T>ROOT;
    
    protected int size;
    protected int height;

    public enum Traverse {
        inorder, preorder, postorder
    }

    public BinaryTree() {

    }
    
    public Node<T> getRoot () {
        return this.ROOT;
    }

    @Override
    public abstract void insert(T data);

    @Override
    public abstract void delete(T data);

    @Override
    public abstract Node<T> search(T data);
    
    public int size() {
        return this.size;
    }
    
    public int height () {
        return this.height(ROOT);
    }
    
    public int height (Node <T> root) {
        return root == null ?  0 :  Math.max(height(root.left), height(root.right)) + 1;
    }
    
    public List<Node> dfs (Node<T> root, Traverse traverse) {
        switch (traverse) {
            case inorder: return inorderTraversal(root);
            case preorder: return preOrderTraversal(root);
            case postorder: return postOrderTraversal(root);
            default: return inorderTraversal(root);
        }
    }

    public List <Node> dfs(Traverse traverse) {
        return dfs(this.ROOT, traverse);
    }
    
    public List<Node> bfs () {
        return this.bfs(this.ROOT);
    }
    
    
    public List<Node> bfs  (Node<T> root) {
        List <Node>nodeList = new LinkedList();
        if (root == null) {
            return null;
        }
        Queue <Node>nodeQueue = new LinkedBlockingQueue();
        nodeList.add(this.ROOT);
        nodeQueue.add(root);
        
        while(!nodeQueue.isEmpty()) {
            Node visitedNode = nodeQueue.poll();
            
            if (visitedNode.left != null) {
                nodeQueue.add(visitedNode.left);
                nodeList.add(visitedNode.left);
            } if (visitedNode.right != null) {
                nodeQueue.add(visitedNode.right);
                nodeList.add(visitedNode.right);
            }
        }
        
        return nodeList;
    }

    public Node left(Node node) {
        return node.left;
    }

    public Node right(Node node) {
        return node.right;
    }

    public List inorderTraversal(Node root) {
        List <Node>nodes = new LinkedList();
        if (root.left != null) {
            nodes.addAll(inorderTraversal(root.left));
        }
        
        nodes.add(root);

        if (root.right != null) {
            nodes.addAll(inorderTraversal(root.right));
        }
        
        return nodes;
    }

    public List<Node> preOrderTraversal(Node root) {
        List <Node>nodes = new LinkedList();
        
        nodes.add(root);
        
        if (root.left != null) {
            nodes.addAll(preOrderTraversal(root.left));
        }

        if (root.right != null) {
            nodes.addAll(preOrderTraversal(root.right));
        }
        
        return nodes;
    }

    public List<Node> postOrderTraversal(Node root) {
        List <Node>nodes = new LinkedList();
        if (root.left != null) {
            nodes.addAll(postOrderTraversal(root.left));
        }

        if (root.right != null) {
            nodes.addAll(postOrderTraversal(root.right));
        }

        nodes.add(root);
        
        return nodes;
    }
    
}
