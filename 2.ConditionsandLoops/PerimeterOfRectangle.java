package com.ConditionsandLoops;


//Perimeter Of Rectangle p=2(l+w)

import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the length: ");
        double l=S.nextDouble();
        System.out.println("Enter the width: ");
        double w=S.nextDouble();

        double p=2*(l+w);
        System.out.println("Perimeter Of Rectangle is :"+p);

    }
}
