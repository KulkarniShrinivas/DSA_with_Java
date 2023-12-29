package com.FunctionsandMethods;

import java.util.Scanner;

public class CalculatetheGrade {
    public static void main(String[] args) {
        int count, i;
        float totalMarks = 0, percentage, average;
        Scanner scanner;
        scanner = new Scanner(System.in);

        System.out.println("Enter Number of Subjects");
        count = scanner.nextInt();

        System.out.println("Enter marks of " +count +" Subject");
        for (i=0;i<count; i++)
        {
            totalMarks += scanner.nextInt();
        }

        System.out.println("Total marks : "+ totalMarks);
        percentage = (totalMarks / (count*100))*100;

        switch ((int)percentage/10)
        {
            case 9:
                System.out.println("Grade : A+");
                break;
            case 8:
            case 7:
                System.out.println("Grade : A");
            case 6:
                System.out.println("Grade : B");
                break;
            case 5:
                System.out.println("Grade : C");
                break;
            default :
                System.out.println("Grade : D");
                break;

        }
    }
}
