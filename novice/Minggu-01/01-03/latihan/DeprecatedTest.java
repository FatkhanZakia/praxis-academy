package com.demo;

public class DeprecatedTest {
    @Deprecated
    public void Display(){
        System.out.println("DeprecatedTest Display()");
    }
}
class SuppressWarning{
    @SuppressWarnings({"checked", "deprecation"})
    public static void main(String[] args) {
        DeprecatedTest d1 = new DeprecatedTest();
        d1.Display();
    }
}