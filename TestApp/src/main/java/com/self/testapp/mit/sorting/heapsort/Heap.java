/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.self.testapp.mit.sorting.heapsort;

/**
 *
 * @author Sunil
 */
public class Heap {
    private int elements[];
    
    
    public Heap (int []elements) {
        this.elements = elements;
    }
    
    public int[] getElements () {
        return this.elements;
    }
    
    public int parent (int index) {
        if (index == 1) {
            return -1;
        }
        
        return index/2;
    }
    
    public int left (int index) {
        if (2 * index + 1 <= elements.length - 1) {
            return 2 * index + 1;
        } else {
            return elements.length + 1;
        }
    }
    
    public int right (int index) {
        if (2 * index + 2 <= elements.length - 1) {
            return 2 * index + 2;
        } else {
            return elements.length + 1;
        }
    }
    
    public void maxHeapify (int index) {
        int left = left(index);
        int right = right(index);
        
        int largest;
        
        if (left <= elements.length && elements[left] > elements[index]) {
            largest = left;
        } else {
            largest = index;
        }
        if (right <= elements.length && elements[right] > elements[largest]) {
            largest = right;
        }
        
        if (largest != index) {
            int temp = elements[index];
            elements[index] = elements[largest];
            elements[largest] = temp;
            
            maxHeapify(largest);
        }
    }
    
    public void buildMaxHeap () {
        for(int i = elements.length / 2; i >= 0; i--) {
            maxHeapify(i);
        }
    }
    
    public static void main(String[] args) {
        Heap h = new Heap(new int[]{-1,2,42,4,1,20,6,8,12,9, 30, 18});
        
        h.buildMaxHeap();
        
        int j[] = h.getElements();
        
        for(int i: j) {
            System.out.println(i);
        }
    }
}
