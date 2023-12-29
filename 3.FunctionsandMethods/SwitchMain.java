package com.FunctionsandMethods;

import java.util.Scanner;

public class SwitchMain {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String fruit=in.next();

        /*switch(fruit)
        {
            case "Mango":
                System.out.println("This is sweet mango");
                break;
            case "Apple":
                    System.out.println("This is red fruit");
                    break;
            case "orange":
                System.out.println("This is Orange");
                break;
            case "Grapes":
                System.out.println("This is Orange fruit");
                break;
            default:
                System.out.println("Please enter valid fruit");
        }*/
        switch (fruit) {
            case "Mango" -> System.out.println("This is sweet mango");
            case "Apple" -> System.out.println("This is red fruit");
            case "orange" -> System.out.println("This is Orange");
            case "Grapes" -> System.out.println("This is Orange fruit");
            default -> System.out.println("Please enter valid fruit");
        }
    }
}
