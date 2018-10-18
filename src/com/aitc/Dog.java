package com.aitc;

public class Dog {
    public static void main(String [] args){
        NameOfDog("shun");
        bark();
        slip();
        eat();
    }
    public static void NameOfDog(String name){
        System.out.println(String.format("my name is : %s",  name));
    }
    public static void bark(){
        System.out.println("i am barking");
    }
    public static void slip(){
        System.out.println("i am slipping");
    }
    public static void eat(){
        System.out.println("i am eating");
    }
}
