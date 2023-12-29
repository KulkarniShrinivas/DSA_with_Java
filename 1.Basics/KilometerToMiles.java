package com.Basics;

import java.util.Scanner;

public class KilometerToMiles {
    public static void main(String[] args) {
        float km;
        float miles;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the km: ");
        km=in.nextFloat();
        miles=(float) (0.6213711922*km);
        System.out.println(miles);



    }
}
