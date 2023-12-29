package com.FunctionsandMethods;

public class EvenOdd_BitwiseOR {
    public static void main(String[] args) {
        int n=100;

        if ((n | 1)>n) //((n&1)==1)  //((num ^ 1) == num+1)
        {
            System.out.println("Number is even");
        }
        else
        {
            System.out.println("Number is odd");
        }
    }
}
