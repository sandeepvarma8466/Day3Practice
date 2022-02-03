package com.Bridgelabz.Day5;

public class Forloop {
    public static void main(String[] args) {

        System.out.println("For Loop");
        for (int i = 1; i < 10; i = i * 3)
            System.out.println("--------"+i+"----------");

        System.out.println("while loop");

        int i=0;
      //  System.out.println(i>10);
        while (i<10) {
            //
            System.out.println("----------" + i + "----------");
            i++;
        }
            System.out.println("do while Loop");
            i=0;
            do {
                System.out.println(".........."+i+"........");
                i++;
            }while (i<10);
    }
}
