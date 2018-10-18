package com.aitc;

public class VoidMethod {
    public static void main(String [] args){
        greet("John");
        greet("Helen");
        greet("Stacy");
        greet("Sat");
    }
    public static void greet(String name){
        System.out.println(String.format("Hello, %s" , name));
    }
}
