package com.ConditionsandLoops;

//Volume Of Cylinder V=pi*r*r*h

import java.util.Scanner;

public class VolumOfCylinder {

    public static void main(String[] args) {
        double pi=3.142;
        Scanner S=new Scanner(System.in);
        System.out.println("Enter the radius: ");
        double r=S.nextDouble();
        System.out.println("Enter the height");
        double h=S.nextDouble();

        double v=pi*r*r*h;
        System.out.println("Volume Of Cylinder: "+v);


    }
}
