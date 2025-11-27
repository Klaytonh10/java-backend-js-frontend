package com.example;

import com.sun.net.httpserver.HttpServer;

import java.net.InetSocketAddress;

public class Main {
    public static void main(String[] args) throws Exception {

        HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);
        server.createContext("/person", new PersonHandler());
        server.start();
        System.out.println("Server running on port 8080");

    }
}
