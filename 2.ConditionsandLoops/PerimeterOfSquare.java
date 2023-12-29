package com.ConditionsandLoops;

import java.util.Scanner;

//Perimeter Of Square p=4a a=side
public class PerimeterOfSquare {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter side: ");
        double s=S.nextDouble();

        double p=4*s;
        System.out.println("Perimeter Of Square :"+p);
    }
}
