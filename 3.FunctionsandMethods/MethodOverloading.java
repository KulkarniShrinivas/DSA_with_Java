package com.FunctionsandMethods;

//Same name with diffrent arguments
public class MethodOverloading {
    public static void main(String[] args) {
        fun(67);
        fun("Kunal");
    }
    static void fun(int a)
    {
        System.out.println(a);
    }
    static void fun(String name)
    {
        System.out.println(name);
    }
}
