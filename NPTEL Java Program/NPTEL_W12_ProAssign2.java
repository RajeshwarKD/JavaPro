package com.company;
/*A partial code fragment is given. The URL class object is created in try block.You should write appropriate method( )
to print the protocol name and host name from the given URL string.*/
/*  for example :
        https://www.xyz.com:1080/index.html
        protocol://host:port/filename       */

import java.net.*;
public class NPTEL_W12_ProAssign2 {
    public static void main(String[] args) {
        try{
            URL url=new URL("https://www.nptel.com:1080/java-tutorial.html");

            //use appropriate code to print the protocol name and host name from url
            // Write the method() by replacing the blank space
            System.out.println("Protocol: "+url.getProtocol());
            System.out.println("Host Name: "+url.getHost());
            System.out.println("Port Number: "+url.getPort());
            System.out.println("File Name: "+url.getFile());
        }
        catch(Exception e){System.out.println(e);}
    }
}
