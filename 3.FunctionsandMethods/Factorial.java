package com.FunctionsandMethods;

import java.util.Scanner;

public class Factorial {
    public static void main(String args[])
    {
        int n, c, fact = 1;
        System.out.println("Enter an integer to calculate it's factorial");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        if ( n < 0 )
            System.out.println("Number should be non-negative.");
        else
        {
            for ( c = 1 ; c <= n ; c++ )
                fact = fact*c;
            System.out.println("Factorial of "+n+" is = "+fact);
        }
    }


}

//using recursion

/*static int factorial(int n){
    if (n==0)
        return 1;
    else
        return(n*factorial(n-1));
}

public static void main(String args[])
{
    int i,fact=1;
    int number=4;
    fact=factorial(number);
    System.out.println("Factorial of " +number+ "is: "+fact);
}
}*/

