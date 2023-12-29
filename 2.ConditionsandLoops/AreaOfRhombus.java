package com.ConditionsandLoops;

//Area Of AreaOfRhombus area= p*q/2 p=digonal q=diagonal

import java.util.Scanner;

public class AreaOfRhombus {
    public static void main(String[] args) {
        Scanner S=new Scanner(System.in);
        System.out.println("Enter the digonal1:");
        double d1=S.nextDouble();
        System.out.println("Enter the Digonal2: ");
        double d2=S.nextDouble();

        double area=(d1*d2)/2;

        System.out.println("Area Of Rhombus is :"+ area);

    }
}
