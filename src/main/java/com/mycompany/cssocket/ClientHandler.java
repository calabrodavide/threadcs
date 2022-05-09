/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cssocket;

import java.io.*;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author david
 */
public class ClientHandler extends Thread{
    
    private BufferedReader in;
    private PrintWriter out;
    private Socket socket;
    
    ClientHandler(Socket socket){
        try {
            this.socket = socket;
            
            out = new PrintWriter(socket.getOutputStream());
            
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            
            start();
        } catch (IOException ex) {
            Logger.getLogger(ClientHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public void run(){

        try {
            System.out.println(in.readLine());
        } catch (IOException ex) {
            Logger.getLogger(ClientHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
