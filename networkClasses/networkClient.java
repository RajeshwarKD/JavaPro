package com.company;

import java.io.*;
import java.net.*;

public class networkClient {
    public static void main(String[] args) throws Exception{
        Socket clientConnection =new Socket("localhost", 1212);
        DataOutputStream clientMsg = new DataOutputStream(clientConnection.getOutputStream());
        clientMsg.writeUTF("Hello Friend");
        clientMsg.flush();
        clientMsg.close();
        clientConnection.close();
    }
}
