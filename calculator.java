package com.company;

import java.util.Scanner;

public class Main {

    static int addition (int p1, int p2){
        return (p1 + p2);
    }
    static int subtraction(int p1, int p2){
        return (p1 - p2);
    }
    static int multiplication (int p1, int p2){
        return (p1 * p2);
    }
   static int division (int p1, int p2){
        return (p1 / p2);
    }
    static int modulo (int p1, int p2){
        return (p1 % p2);
    }

    public static void calc() throws InterruptedException {

        System.out.println("Welcome to our calc loading ...");
        Thread.sleep(1500);
        var scanner = new Scanner(System.in);
        System.out.println("Hey dude please enter a number\n");
        int num1 = scanner.nextInt();
        System.out.println("Hey dude please enter a number\n");
        int num2 = scanner.nextInt();
        System.out.println("Please enter an ops ; / * - + % ");
        var ops = scanner.next();

        switch (ops){
            case "+":
                System.out.println(addition(num1, num2));
                break;
            case "-":
                System.out.println(subtraction(num1, num2));
                break;
            case "*":
                System.out.println(multiplication(num1, num2));
                break;
            case "/":
                System.out.println(division(num1, num2));
                break;
            case "%":
                System.out.println(modulo(num1,num2));
                break;
            default:
                System.out.println(addition(num1, num2));
                System.out.println(subtraction(num1, num2));
                System.out.println(multiplication(num1, num2));
                System.out.println(division(num1, num2));
                System.out.println(modulo(num1,num2));
                break;


        }
    }
    public static void main(String[] args) throws InterruptedException {
        calc();
    }
}
