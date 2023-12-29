package com.ConditionsandLoops;


import java.util.Scanner;

//Volume Of Cone Java Program v=pi*r*r(h/3)
public class VolumeOfCone {
    public static void main(String[] args) {
        double pi=3.142;
        Scanner S=new Scanner(System.in);
        System.out.println("Enter the radius :");
        double r=S.nextDouble();
        System.out.println("Enter height :");
        double h=S.nextDouble();

        double V=pi*r*r*(h/3);
        System.out.println("Volume Of Cone Java Program: "+V);
    }
}
