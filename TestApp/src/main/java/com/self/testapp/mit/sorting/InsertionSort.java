/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.self.testapp.mit.sorting;

/**
 *
 * @author sunil
 */
public class InsertionSort {
    public static int[] sort (int []array) {
        int temp;
        
        for(int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (array[j] < array[j-1]) {
                    temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
            }
        }
        
        return array;
    }
    
    public static void main(String[] args) {
        int arr[] = sort(new int[] {6,5,4,3,2,1});
        
        for (int a: arr) {
            System.out.println(a);
        }
    }
}
