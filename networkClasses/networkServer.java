package com.company;

import java.io.*;
import java.net.*;

public class networkServer {
    public static void main(String[] args) throws Exception{
    ServerSocket serverConnection = new ServerSocket(1212);
    Socket clientSocket = serverConnection.accept();

    DataInputStream massage = new DataInputStream(clientSocket.getInputStream());
    String readMsg = massage.readUTF();
        System.out.println(readMsg);
        serverConnection.close();
    }
}
