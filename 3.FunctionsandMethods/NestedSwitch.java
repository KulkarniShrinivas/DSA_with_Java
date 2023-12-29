package com.FunctionsandMethods;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID =in.nextInt();
        String department =in.next();

        switch(empID)
        {
            case 1:
                System.out.println("Manoj Kulkarni");
                break;
            case 2:
                System.out.println("Shrinivas kulkarni");
                break;
            case 3:
                System.out.println("Emp num 3");
                switch (department)
                {
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "Management":
                        System.out.println("Management Department");
                        break;
                    default:
                        System.out.println("No department for emp");

                }
                break;
            default:
                System.out.println("enter correct empid");
        }
    }
}
