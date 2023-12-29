package com.Basics;


import java.util.Scanner;

//To find out whether the given String is Palindrome or not.
public class Palindrome
{
    public static void main(String[] args) {
        /*String original, reverse="";
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a string/number");
        original=in.nextLine();
        int length = original.length();

        for(int i=length-1;i>=0;i--)
            reverse =reverse +original.charAt(i);
        if (original.equals(reverse))
            System.out.println("The number is Palindrome");
        else
            System.out.println("The number is not palindrom");*/
        int r,sum=0,temp;
        int n=456;
         temp=n;
         while (n>0)
         {
             r=n%10;
             sum=(sum*10)+r;
             n=n/10;
         }
         if (temp==sum)
             System.out.print("Palindrom");
         else
             System.out.println("Not Palindrom");
    }

}
