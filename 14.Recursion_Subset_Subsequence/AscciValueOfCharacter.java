package Recursion_Subset_Subsequence;

import java.util.ArrayList;

public class AscciValueOfCharacter {
    public static void main(String[] args) {
//        subseqAscii("", "abc");
        System.out.println(subseqAsciArray("", "abc"));
    }

    static void subseqAscii(String p, String up) {
        //whenver unprocessed is empty print processed and return
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        //make two recursion call or ignore the character or include the character


        subseqAscii(p + ch, up.substring(1));
        subseqAscii(p, up.substring(1));
        subseqAscii(p + (int) ch, up.substring(1));
    }

    static ArrayList<String> subseqAsciArray(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> first = subseqAsciArray(p + ch, up.substring(1));
        ArrayList<String> second = subseqAsciArray(p, up.substring(1));
        ArrayList<String> third = subseqAsciArray(p + (ch+0), up.substring(1));

        first.addAll(second);
        first.addAll(third);
        return first;

    }
}


//This is for string