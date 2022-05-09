/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cssocket;

import java.io.*;
import java.net.*;
import java.util.logging.*;

/**
 *
 * @author david
 */
public class Server {
    
    private ServerSocket serversocket;
    private Socket socket;
    
    Server(int port){
        try {
            serversocket = new ServerSocket(port);
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void start() {
        try {
            
            while(true){
            
            socket = serversocket.accept();
            
            System.out.println("Client collegato " + socket.getInetAddress().getHostAddress());
            
            ClientHandler c = new ClientHandler(socket);
            
            }
            
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void close() {

        try {
            socket.close();
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
}
