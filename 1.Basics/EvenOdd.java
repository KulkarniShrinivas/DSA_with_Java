package com.Basics;



//Write a program to print whether a number is even or odd, also take input from the user
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int n= input.nextInt();
        int number =n;

        if(number %2 ==0)
        {
            System.out.println("even");

        }
        else
        {
            System.out.println("Odd");
        }
    }
}

