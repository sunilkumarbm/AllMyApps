/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.self.testapp.mit.documentDistance;

/**
 *
 * @author sunil
 */
public class DocumentDistance {
    public static void main(String[] args) {
        Document d1 = new Document("hello world\nsunil world");
        
        System.out.println("Distance = " + d1.compare(new Document("raja rani rorer rocket")));
    }
}
