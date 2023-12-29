package com.Array_and_ArrayList;

import java.util.Arrays;

import static java.util.Collections.swap;
import static sun.swing.MenuItemLayoutHelper.max;

public class Swap {

    public static void main(String[] args) {
        int[] arr= {1,2,3,34,2,18};
        swap(arr, 0, 4);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int index1, int index2) {
        int temp =  arr[index1];
        arr[index1]= arr[index2];
        arr[index2]=temp;
    }



    }



