package com.codersbay;

import java.util.Scanner;


public class Fibonacci {

    public static void main(String[] args) {
        System.out.println("Hello Fibonacci");
        Scanner sc = new Scanner(System.in);
        Integer stopp = sc.nextInt();
        System.out.println(calcFib(stopp));
    }

    private static Integer calcFib(Integer stopp) {
        if (stopp == 0 || stopp == 1) {
            return stopp;
        } else {
            return calcFib(stopp - 1) + calcFib(stopp - 2);
        }
    }


}



