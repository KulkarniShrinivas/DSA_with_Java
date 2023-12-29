package com.ConditionsandLoops;


import java.util.Scanner;

//Perimeter Of Circle c=2*pi*r
public class PerimeterOfCircle {
    public static void main(String[] args) {
        double pi= 3.142;
        Scanner S= new Scanner(System.in);
        System.out.println("enter the radius :");
        double r=S.nextDouble();

        double circle= 2*pi*r;
        System.out.println("Perimeter Of Circle :"+ circle);


    }
}
