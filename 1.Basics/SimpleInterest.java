package com.Basics;


//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args)
    {


        Scanner in=new Scanner(System.in);
        int result;
        int P=in.nextInt();
        int T=in.nextInt();
        int R=in.nextInt();


        result=P*T*R/100;

        System.out.println(result);

        System.out.print("Simple interest ");


    }

}
