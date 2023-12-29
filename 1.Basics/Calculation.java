package com.Basics;

import java.util.Scanner;

public class Calculation {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter operator");

        int res = 0;

        while (true) {
            System.out.print("Enter the operator:");
            System.out.println();
            char op = in.next().trim().charAt(0);

            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') ;
            {
                System.out.print("Enter two numbers:");
                System.out.println();

                int a = in.nextInt();
                int b = in.nextInt();
                System.out.println();


                if (op == '+') {
                    res = a + b;
                }
                if (op == '-') {
                    res = a - b;
                }
                if (op == '*')
                {
                    res = a * b;
                }
                if (op == '/')
                {
                    res = a / b;
                }
                System.out.print(res);

            }
        }
    }
}

