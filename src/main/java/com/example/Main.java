package com.example;

public class Main {
    public static void main(String[] args) {

        try {
            MyServer.startServer();
        }catch (Exception e){
            System.out.println("Whoopsies");
        }

    }
}
