package Sorting_Mergesort;

import java.util.Arrays;

public class InPlace {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        mergesortInPlace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static void mergesortInPlace(int[] arr, int s, int e) {
        if (e - s <= 1) {
            return; // Base case: Arrays of size 0 or 1 are already sorted.
        }

        int mid = (s + e) / 2;

        mergesortInPlace(arr, s, mid);
        mergesortInPlace(arr, mid, e);

        mergeInPlace(arr, s, mid, e);
    }

    private static void mergeInPlace(int[] arr, int s, int m, int e) {
        int[] mix = new int[e - s];

        int i = s;
        int j = m;
        int k = 0;

        while (i < m && j < e) {
            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i < m) {
            mix[k] = arr[i];
            i++;
            k++;
        }

        while (j < e) {
            mix[k] = arr[j];
            j++;
            k++;
        }

        for (int l = 0; l < mix.length; l++) {
            arr[s + l] = mix[l];
        }
    }
}
