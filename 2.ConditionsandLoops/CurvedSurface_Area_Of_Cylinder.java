package com.ConditionsandLoops;


import java.util.Scanner;

// Curved Surface Area Of Cylinder  C=2*pi*r*h
public class CurvedSurface_Area_Of_Cylinder {
    public static void main(String[] args) {
        double pi=3.142;
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the radius ");
        double r=S.nextDouble();
        System.out.println("Enter the height");
        double h=S.nextDouble();

        double c=2*pi*r*h;
        System.out.println("Curved Surface Area Of Cylinder is: "+c);

    }
}
