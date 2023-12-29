package com.ConditionsandLoops;


//A = P(1 + \frac{r}{n})^{nt}
// A	=	final amount
//P	=	initial principal balance
//r	=	interest rate
//n	=	number of times interest applied per time period
//t	=	number of time periods elapsed

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        double p,r,n,t;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the principal amount:");
         p=sc.nextDouble();
        System.out.println("enter rate of interest");
         r=sc.nextDouble();
        System.out.println("number of times interest applied per time period ");
         n= sc.nextDouble();
        System.out.println("number of time time period ");
         t=sc.nextDouble();

        double amount = p*Math.pow(1+(r/n),n*t);
        double cinterest = amount - p;
        System.out.println("Coumpound  interest after "+t+" years: "+cinterest);
        System.out.println("amount after "+t+"years: "+amount);



    }
}
