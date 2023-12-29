package com.Basics;

import java.util.Scanner;

public class Percentage {
    public static void main(String[] args) {
        float percentage;
        float total_marks;
        float scored;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter your total marks");
        scored=in.nextFloat();

        System.out.println("Enter gtotal marks ");
        total_marks=in.nextFloat();
        percentage=(float)((scored/total_marks)*100);
        System.out.println("Percentage :" +percentage);
    }
}
