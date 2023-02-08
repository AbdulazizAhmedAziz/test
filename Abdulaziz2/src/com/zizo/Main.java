package com.zizo;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello Abdulaziz");
        System.out.println(10 + 10);//System.out.println is used to print out to the console.
        //primitives
        int number1= 20;
        int number2= 30;
        System.out.println(number1+number2);
        int result= number1+ number2;
        System.out.println(result);
        /*
        Multi-
        Line
        Comment
         */
        double pi=3.14;
        boolean isAdult= true;
        char a= 'A';
        byte n= 127;
        int amount= 1_000_000;
        System.out.println(amount);
        /*
        We have stopped at 1:00:00--Amigoscode video!
        We will continue tomorrow!
         */
        int numberOne= 10;
        int numberTwo= 3;
        System.out.println(numberOne/numberTwo);
        System.out.println(numberOne % numberTwo);
        System.out.println(numberTwo % numberOne);
        int number= 1;
        int increment= number++;
        int decrement= number--;
        System.out.println(increment);
        System.out.println(decrement);
        System.out.println(++number);
    }
    public class HideAndSeek {
        public static void main(String[] args) {
            System.out.println("Let's play hide and seek.");
            System.out.print("Three...");
            System.out.print("Two...");
            System.out.println("One...");
            System.out.println("Ready or not, here I come!");
        }
    }
}