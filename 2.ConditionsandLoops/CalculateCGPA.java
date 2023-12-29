package com.ConditionsandLoops;

//Calculate CGPA Java Program
//multiplying the overall grade score by the credit score of each subject by the total credit scores.

import java.util.Scanner;

public class CalculateCGPA {
   /* public static void main(String[] args) {
        double English,Hindi,Maths,Science,CGPA,CGPAper;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the cgpa marks of English");
        double e=sc.nextDouble();
        System.out.println("Enter the cgpa marks of Hindi");
        double h=sc.nextDouble();
        System.out.println("Enter the cgpa marks of Maths");
        double m=sc.nextDouble();
        System.out.println("Enter the cgpa marks of Science");
        double s=sc.nextDouble();
        CGPA = (e+h+m+s)/(5.0);
        CGPAper = (float)(9.5 * (CGPA));
        System.out.println(" CGPA Percentage is:  "+CGPAper);


    }
}*/

    public static double Calculate_CGPA(double[] marks, int number)
    {
        //Declaring variables..
        double grade[] = new double[number];
        double cgpa, sum = 0;
        for (int i = 0; i < number; i++)
        {
            grade[i] = (marks[i] / 10);
        }

        for (int i = 0; i < number; i++)
        {
            sum += grade[i];
        }
        cgpa = sum / number;
        return cgpa;
    }
    public static void main(String args[])
    {
        int number = 5;
        double[] marks= { 90, 80, 80, 80, 90 };
        double cgpa = Calculate_CGPA(marks, number);
        System.out.println("CGPA = " + cgpa);

        System.out.println("CGPA Percentage = "+ String.format("%.2f", cgpa * 9.5));
    }
}