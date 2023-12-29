package com.Basics;


import java.util.Scanner;

//Input currency in rupees and output in USD.
public class CurrencyinRupees {
    public static void main(String[] args) {
        float rupees;
        Scanner in=new Scanner(System.in);
        System.out.println("Please enter  rupees");
        rupees =in.nextLong();
        float dollars =rupees/82;
        System.out.println(dollars + " Dollars");
    }
}
