package com.ConditionsandLoops;


//Area Of Isosceles Triangle   area=b*h/2

import java.util.Scanner;

public class IsoscelesTriangle {
    public static void main(String[] args) {
        Scanner S=new Scanner(System.in);
        System.out.println("Enter the base");
        double b=S.nextDouble();
        System.out.println("Enter the height");
        double h=S.nextDouble();

        double area=(b*h)/2;
        System.out.println("Area Of Isosceles Triangle is "+ area);
    }
}
