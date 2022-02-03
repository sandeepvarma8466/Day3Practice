package com.Bridgelabz.Day4;

import java.util.Scanner;

public class JavaPractice {
    public static void main(String[] args) {
        System.out.println("Hello world");
        System.out.println("Enter Two Numbers : ....");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your First Number: ");
        int i1 = sc.nextInt();
        System.out.println("Enter Your Second Number : ");
        int i2 = sc.nextInt();
        int multiply = ( i1 * i2 );
        System.out.println("Multiplication of two numbers is" + multiply );
    }
}
