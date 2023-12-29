package com.Basics;
import java.util.Scanner;

public class Temeprature {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please enter temp in C: ");
        float tempC = input.nextFloat();
        float tempF = (tempC*9/5)+32;
        System.out.println(tempF);

    }
}

