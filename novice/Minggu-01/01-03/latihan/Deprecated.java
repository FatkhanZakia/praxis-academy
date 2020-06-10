package com.demo;

public class Deprecated {
    @java.lang.Deprecated
    private void Display(){
        System.out.println("Deprecated Display()");
    }

    public static void main(String[] args) {
        Deprecated deprecated = new Deprecated();
        deprecated.Display();
    }
}
