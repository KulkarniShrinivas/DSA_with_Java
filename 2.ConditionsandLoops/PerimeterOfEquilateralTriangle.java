package com.ConditionsandLoops;

import java.util.Scanner;

//Perimeter Of Equilateral Triangle P=3a

public class PerimeterOfEquilateralTriangle {

    public static void main(String[] args) {
        Scanner S=new Scanner(System.in);
        System.out.println("Enter the side: ");
        double a=S.nextDouble();

        double p=(3*a);

        System.out.println("Perimeter Of Equilateral Triangle is :" +p);
    }
}
