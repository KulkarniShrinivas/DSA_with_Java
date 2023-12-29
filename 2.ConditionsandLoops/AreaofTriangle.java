package com.ConditionsandLoops;


//Area Of Triangle area=1/2(b*h)

import java.util.Scanner;

public class AreaofTriangle {
    public static void main(String[] args) {
        Scanner S=new Scanner(System.in);
        System.out.println("Enter the area height");
        double b=S.nextFloat();
        System.out.println("Enter the height");
        double h=S.nextFloat();
       double area=(b*h)/2;
        System.out.println("Area of triangle is: "+ area);



    }
}
