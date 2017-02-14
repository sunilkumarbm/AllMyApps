/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sunnytech.rmi.server;

import com.sunnytech.rmi.AddC;
import java.rmi.Naming;

/**
 *
 * @author Sunil
 */
public class Server {
    public static void main(String[] args) throws Exception {
        AddC addObj = new AddC();
        Naming.rebind("ADD", addObj);
        System.out.println("Server Started");
    }
}
