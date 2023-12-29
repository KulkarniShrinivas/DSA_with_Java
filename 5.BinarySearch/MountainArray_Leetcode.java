package com.BinarySearch;

public class MountainArray_Leetcode {
    public static void main(String[] args) {

    }

    //https://leetcode.com/problems/peak-index-in-a-mountain-array/
    public int peakIndexInMountainArray(int[] arr) {
        int start=0;
        int end=arr.length-1;

        while(start<end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {

                //you are in dec part of array
                //this may be the ans,but look at left
                //this is ehy end!=mid-1
                end = mid;


            }else {
                //you are in asc part of array
                start=mid+1; //because we know that mid+1 elements> mid element
            }
        }
        //in the end, start == end and pointing to the largest number because of the 2 checks above
        //start and end are always trying to find max element in the above 2 checks
        //hence, when the are pointing to just one element, that is the max one because that is what the check say
        //more eloboration at every point of time for start and end thet have the best possible answer till that time
        //and if we are saying that only one item is  remaining,hence buz of abiove the best possible answer

        return start; //return end as both are =
    }
}
