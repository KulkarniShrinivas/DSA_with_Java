package com.FunctionsandMethods;

import java.sql.SQLOutput;
import java.util.Scanner;

public class LargestSmallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Largest and smallest of three numbers");
        System.out.println("Please enter first number :");
        int first= scanner.nextInt();

        System.out.println("Enter the second number");
        int second= scanner.nextInt();

        System.out.println("Enter the third number :");
        int third = scanner.nextInt();

        int largest = largest(first, second, third);
        int smallest = smallest(first, second, third);

        System.out.printf("largest of three numbers %d, %d, and %d is : %d %n",
                first, second, third, largest);
        System.out.printf("smallest of three numbers %d, %d, and %d is : %d %n",
                first, second, third, smallest);
        scanner.close();

    }



    private static int largest(int first, int second, int third) {
        int max= first;
        if (second>max)
        {
            max= second;
        }
        if (third>max)
        {
            max = third;
        }
        return max;
    }

    private static int smallest(int first, int second, int third) {
        int min= first;
        if (second<min)
        {
            min= second;
        }
        if (third<min)
        {
            min = third;
        }
        return min;
    }
}
