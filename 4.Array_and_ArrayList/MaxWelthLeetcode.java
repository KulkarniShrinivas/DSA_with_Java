package com.Array_and_ArrayList;

public class MaxWelthLeetcode {
    public static void main(String[] args) {
        
    }
    public int maxwelth(int[][] accounts)
    {
        int ans=Integer.MIN_VALUE;
        for (int person = 0; person <accounts.length ; person++) {
            int sum=0;
            for (int account = 0; account < account; account++) {
                sum +=accounts[person][account];

            }
            //check with overall answer

            if (sum>ans)
            {
                ans= sum;
            }
            
        }
        return ans;
    }
}
