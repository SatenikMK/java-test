package com.aitc;

public class StringMethod {
        public static void main(String [] args){
            System.out.println(greet("John"));
            System.out.println(greet("Helen"));
            System.out.println(greet("Stacy"));
            System.out.println(greet("Sat"));
        }
        public static String greet(String name){
            return String.format("hello, %s, welcome to java", name);
        }
    }


