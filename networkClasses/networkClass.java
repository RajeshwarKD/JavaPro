package com.company;

import java.net.*;

public class networkClass {
    public static void main(String[] args) throws Exception{
        URL obj = new URL("http://www.sstc.ac.in:60/index.html");
        System.out.println(obj.getProtocol());
        System.out.println(obj.getHost());
        System.out.println(obj.getPort());
        System.out.println(obj.getFile());

        byte[] IPAddress =new byte[] {127,0,0,1};
        InetAddress ip = InetAddress.getByAddress("Localhost", IPAddress );
        System.out.println(ip.getHostName());
        System.out.println(ip.getHostAddress());

    }
}
