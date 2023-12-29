package com.FunctionsandMethods;

import java.util.Scanner;

public class Voting {
    public static void main(String[] args) {
        int age;
        Scanner sc= new Scanner(System.in);
        age = sc.nextInt();
        if (age>= 18)
        {
            System.out.println("you are eligible for vote");
        }
        else
        {
            System.out.println("you are not eligible for vote");
        }
    }
}
