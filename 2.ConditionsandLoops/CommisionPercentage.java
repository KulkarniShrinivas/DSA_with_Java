package com.ConditionsandLoops;

import java.util.Scanner;


//Calculate Commission Percentage

public class CommisionPercentage {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter amount");
        double amount=sc.nextDouble();
        System.out.println("Enter commisionPercentage");
        double commissionPercentage= sc.nextDouble();

        double commission=(commissionPercentage/100)*amount;
        System.out.println("Commision amount="+commission);
    }

}
