package com.FunctionsandMethods;

import java.util.Scanner;

public class SumofTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first Number: ");
        int num1=sc.nextInt();

        System.out.println("Enter Second number :");
        int num2= sc.nextInt();

        sumNum(num1,num2);
    }

    private static void sumNum(int num1, int num2) {
        int sum=0;
        sum=num1+num2;
        System.out.println("sum of two nyumbers "+sum);
    }
}
