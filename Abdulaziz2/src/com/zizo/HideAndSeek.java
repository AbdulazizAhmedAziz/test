package com.zizo;

import java.sql.SQLOutput;

public class HideAndSeek {
    public static void main(String[] args) {
        System.out.println("Let's play hide and seek.");
        System.out.print("Three...");
        System.out.print("Two...");
        System.out.println("One...");
        System.out.println("Ready or not, here I come!");
        System.out.println("Lol");
        System.out.println(10>10);
        boolean isAdult= 16>=16;
        System.out.println(isAdult);
        int numberTwo= 10;
        int result= 5;
        result*=numberTwo;
        System.out.println(result);
        //Strings
        /*
        If you want to store names or characters, just use strings!
         */
        String brand="Aziz Code";
        System.out.println(brand);
        String one= "1";
        String two= "2";
        String rand= one + two; //It concatenates the strings together.
        System.out.println(one+two); //It outputs 12, because it has concatenated them together.
        System.out.println(brand.toUpperCase());
        System.out.println(brand.toLowerCase());
        System.out.println(brand.substring(0,5));
        System.out.println("   ".isBlank());
        System.out.println("a".isEmpty());
        System.out.println("    a    ".trim()); //it will rewrite it at the beginning of the sentence.
        String c= "abc".substring(0);
        System.out.println(c);

    }
}
