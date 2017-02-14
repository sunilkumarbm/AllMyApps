/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sunnytech.lambdas;

/**
 *
 * @author Sunil
 */
public class TypeInferenceExample {
    public static void main(String[] args) {
        printLambda(s -> s.length());
    }
    
    public static void printLambda(StringLengthLambda sll) {
        System.out.println(sll.getLength("hello"));
    }
    
    interface StringLengthLambda {
        int getLength(String str);
    }
}
