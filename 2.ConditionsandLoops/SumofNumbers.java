package com.ConditionsandLoops;


//Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)


import java.util.Scanner;

public class SumofNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int variable = 0;
        while(true)
        {
            int m = input.nextInt();
            if( m == 0 )
            {
                break;
            }
            if( m>variable)
            {
                variable=m;
            }

        }
        System.out.println(variable);
    }
    }

