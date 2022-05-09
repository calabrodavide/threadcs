/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.cssocket;

/**
 *
 * @author david
 */
public class CSSocket {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Server s1 = new Server(2000);
        
        s1.start();
        
        Client c1 = new Client("127.0.0.1", 2000);
        Client c2 = new Client("127.0.0.1", 2000);
        
        c1.write("We");
        c2.write("ciao");

    }
}
