/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sunnytech.rmi.client;

import com.sunnytech.rmi.AddI;
import java.rmi.Naming;

/**
 *
 * @author Sunil
 */
public class Client {
    public static void main(String[] args) throws Exception {
        AddI obj = (AddI)Naming.lookup("ADD");
        
        System.out.println(obj.add(5, 4));
    }
}
