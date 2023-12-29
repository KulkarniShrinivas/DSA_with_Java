package com.ConditionsandLoops;


//Area Of Rectangle Program  a=l*w

import java.util.Scanner;

public class AreaofRectangle {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the length");
        double l=S.nextDouble();
        System.out.println("Enter the width");
        double  w=S.nextDouble();

        double area=l*w;
        System.out.println("Area of rectangle "+ area);

    }
}
