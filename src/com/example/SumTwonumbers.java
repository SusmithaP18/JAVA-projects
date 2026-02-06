package com.example;

import java.util.Scanner;
    public class SumTwonumbers {
        public static void main(String[] args) {

            Scanner aa = new Scanner(System.in);

            System.out.print("Enter first number: ");
            int a = aa.nextInt();

            System.out.print("Enter second number: ");
            int b = aa.nextInt();

            int d = a + b;


            System.out.println("d = " + d);

            aa.close();
        }
    }
