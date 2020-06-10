package com.demo;

class Annotation {
    public void justaMethod(){
        System.out.println("Parent class of method()");
    }

    public static void main(String[] args) {
        Annotation annotation = new Annotation();
        annotation.justaMethod();
    }
}
class ChildClass extends Annotation{
    @Override
    public void justaMethod(){
        System.out.println("show()");
    }
}
