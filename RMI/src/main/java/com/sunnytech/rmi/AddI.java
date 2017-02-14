/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sunnytech.rmi;

import java.rmi.Remote;

/**
 *
 * @author Sunil
 */
public interface AddI extends Remote {
    public int add (int a, int b) throws Exception;
}
