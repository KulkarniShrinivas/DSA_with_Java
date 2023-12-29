package com.ConditionsandLoops;

import java.util.Scanner;

//Perimeter Of Parallelogram P=2*(a+b) a=side b=base
public class PerimeterOfParallelogram {

    public static void main(String[] args) {
        Scanner S= new Scanner(System.in);
        System.out.println("Enter the side :");
        double s=S.nextDouble();
        System.out.println("Enter the base");
        double b=S.nextDouble();

        double p=2*(s+b);
        System.out.println("Perimeter Of Parallelogram :"+p);
    }
}
