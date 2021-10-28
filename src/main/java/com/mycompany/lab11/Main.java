/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab11;

import java.io.IOException;

/**
 *
 * @author 000728303
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Formatter form = new Formatter();
        String inFile = "T:\\Software Eng 2\\Lab11\\inFile.txt";
        String outFile =  "T:\\Software Eng 2\\Lab11\\outFile.txt";
        form.format(inFile, outFile);
    }
}
