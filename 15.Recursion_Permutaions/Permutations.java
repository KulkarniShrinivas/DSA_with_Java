package Recursion_Permutaions;

import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {
        permuntaions("", "abc");


//        ArrayList<String> ans = permuntationsList("", "abc");
//        System.out.println(ans);

      int ans = permuntationsCount("", "abcd");

    }

    static void permuntaions(String p, String up) {
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for(int i=0; i<=p.length(); i++) {
            String f= p.substring(0,i);
            String s= p.substring(i, p.length());
            permuntaions(f+ch+s, up.substring(1));
        }
    }

    static ArrayList<String> permuntationsList(String p, String up) {
        if(up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);

        ArrayList<String> ans = new ArrayList<>();

        for(int i=0; i<=p.length(); i++) {
            String f= p.substring(0,i);
            String s= p.substring(i, p.length());
            ans.addAll(permuntationsList(f+ch+s, up.substring(1)));

        }
        return ans;
    }


    //factorial of a number permunation of a string

    static int permuntationsCount(String p, String up) {
        if(up.isEmpty()) {
            return 1;
        }
        int count =0;
        char ch = up.charAt(0);
        for (int i=0; i<=p.length(); i++) {
            String f= p.substring(0,i);
            String s= p.substring(i, p.length());
            count += permuntationsCount(f+ch+s, up.substring(1));
        }
        return count;
    }
}
