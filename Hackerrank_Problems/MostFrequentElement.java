package Hackerrank_Problems;


//Given a list of N numbers, print the most frequent element.
//
//Note : If the frequency of some elements is same, then print the smallest of them.
//
//        Constraints :
//
//N <= 10^5
//Every element of the list is less than 10^9 and greater than 0.
//Input Format
//
//The first line consists of N, the number of elements in the list. N lines follow, each containing one element.
//
//Output Format
//
//Just print the most frequent element.
//
//Sample Input
//
//6
//        4
//        2
//        5
//        5
//        2
//        4
//Sample Output
//
//2
//Explanation
//
//All the six elements are have the same frequency, hence we print the smallest of them i.e '2'.
public class MostFrequentElement {
    public static void main(String[] args) {
        int[] arr = {6,4,2,5,5,2,4};
        int n = arr.length;
        int ans = mostFrequentElement(arr,n);
        System.out.println(ans);
    }

    static int mostFrequentElement(int[] arr, int n){
        int max=0;
        int maxcount=0;
        for(int i=0; i<n; i++){
            int count=0;
            for(int j=0; j<n; j++){
                if(arr[j] == arr[i]){
                    count++;
                }
                else if(count > maxcount){
                    maxcount = count;
                    max = arr[i];
                }
            }
        }
        return max;
    }
}
