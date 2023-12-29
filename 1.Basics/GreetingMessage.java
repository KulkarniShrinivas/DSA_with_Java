package com.Basics;


import java.util.Scanner;

//Take name as input and print a greeting message for that particular name.
public class GreetingMessage
{
    public static void main(String[] args) {


        System.out.print("Enter name: ");
        Scanner in =new Scanner(System.in);
        String name =in.next();
        System.out.print("hello " + name);
        System.out.println();





    }
}
