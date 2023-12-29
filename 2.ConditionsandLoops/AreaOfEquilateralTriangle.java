package com.ConditionsandLoops;

//Area Of Equilateral Triangle a=root(3)/4*a*a

import java.util.Scanner;

public class AreaOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner S= new Scanner(System.in);
        System.out.println("Enter the area ");
        double a=S.nextDouble();

        double area= Math.sqrt(3)/4*a*a;

        System.out.println("Area Of Equilateral Triangle is: "+ area);

    }
}
