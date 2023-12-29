package com.ConditionsandLoops;

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        double dis,amount,markedprice,S;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter marked price");
        markedprice=sc.nextDouble();
        System.out.println("Enter discount");
        dis=sc.nextDouble();
        double s=100-dis;
        amount = (s*markedprice)/100;
        System.out.println("amount after discount "+amount);


    }
}
