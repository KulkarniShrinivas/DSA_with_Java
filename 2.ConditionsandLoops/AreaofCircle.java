package com.ConditionsandLoops;


//Area Of Circle Java Program pi*r*r

import java.util.Scanner;

public class AreaofCircle {
    public static void main(String[] args) {
        int r;
        double pi=3.14, area;
        Scanner S=new Scanner(System.in);
        System.out.println("Enter radius of circle");
        r=S.nextInt();
        area=pi*r*r;
        System.out.println("Area of circle "+area);
    }
}
