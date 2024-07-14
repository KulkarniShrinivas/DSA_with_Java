package Recursion;

public class Palindrome {
    public static void main(String[] args) {
        boolean ans = isPalindrome(12321);
        System.out.println(ans);
    }
    static boolean isPalindrome(int n) {
        if(n == 0) {
            return true;
        }
        return n%10 == n/100 && isPalindrome(n/10);
    }
}
