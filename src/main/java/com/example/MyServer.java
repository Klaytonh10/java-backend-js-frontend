package com.example;

import com.sun.net.httpserver.HttpServer;

import java.net.InetSocketAddress;

public class MyServer {

    private static HttpServer server;

    public static void startServer() throws Exception {
        server = HttpServer.create(new InetSocketAddress(8080), 0);
        server.createContext("/person", new PersonHandler());
        server.setExecutor(null);
        server.start();
        System.out.println("Server running on port 8080");
    }

    public static void stopServer() {
        server.stop(0);
    }

}
