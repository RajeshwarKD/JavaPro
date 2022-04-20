package com.company;

import java.io.*;
import java.net.*;

public class networkURL {
    public static void main(String[] args) throws Exception{
        URL webAddress = new URL("http://www.sstc.ac.in:60/index.html");
        URLConnection connection = webAddress.openConnection();
        InputStream input = connection.getInputStream();
        int i=0;
        while ((i=input.read())!=-1){
            System.out.println((char)i);
        }
    }
}
