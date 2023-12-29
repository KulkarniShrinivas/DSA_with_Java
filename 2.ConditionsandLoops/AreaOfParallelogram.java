package com.ConditionsandLoops;

import java.util.Scanner;

//Area Of Parallelogram a=b*h
public class AreaOfParallelogram {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the base ");
        double b=S.nextDouble();
        System.out.println("Enter height");
        double h=S.nextDouble();

        double area=b*h;
        System.out.println("Area Of Parallelogram is "+ area);
    }
}
