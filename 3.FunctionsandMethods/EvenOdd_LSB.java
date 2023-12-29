package com.FunctionsandMethods;



public class EvenOdd_LSB {
    public static String OddOddLSB(int a) {
        if (a !=0)
        {
            if ((Integer.toBinaryString(a).endsWith("0")))
            {
                return "even";

            }
            else
            {
                return "odd";
            }
        }
        else
        {
            return "zero";
        }
    }
    public static void main(String[] args)
    {
        for (int i = 0; i <=10;i++){
            System.out.println(
                    i + " : " + OddOddLSB(i));
        }
    }
}
