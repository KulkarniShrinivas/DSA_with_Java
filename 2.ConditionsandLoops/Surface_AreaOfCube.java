package com.ConditionsandLoops;

//Total Surface Area Of Cube A=6a*a a=edge


import java.util.Scanner;

public class Surface_AreaOfCube {
    public static void main(String[] args) {
        Scanner S=new Scanner(System.in);
        System.out.println("Enter the edge :");
        double a=S.nextDouble();

        double A=6*a*a;
        System.out.println("Total Surface Area Of Cube : "+A);
    }
}
