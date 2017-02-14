/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sunnytech.rmi;

import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Sunil
 */
public class AddC extends UnicastRemoteObject implements AddI {
    
    public AddC() throws Exception {
        super();
    }

    @Override
    public int add(int a, int b) {
        return a + b;
    }
    
}
