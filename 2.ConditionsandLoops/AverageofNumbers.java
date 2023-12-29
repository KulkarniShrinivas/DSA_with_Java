package com.ConditionsandLoops;

import java.util.Scanner;

public class AverageofNumbers {
    public static void main(String[] args) {
        int num,i,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the N numbers: ");

        i= sc.nextInt();
        System.out.println("Sum up to: ");
        num= sc.nextInt();
        while(i<=num)
        {
            sum=sum+i;
            i++;
        }
        System.out.println("sum of natural numbers ="+sum);





    }
}
