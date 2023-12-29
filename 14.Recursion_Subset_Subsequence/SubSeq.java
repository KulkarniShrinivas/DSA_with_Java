package Recursion_Subset_Subsequence;

public class SubSeq {
    public static void main(String[] args) {
        subseq("", "abc");

    }

    static void subseq(String p, String up) {
        //whenver unprocessed is empty print processed and return
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        //make two recursion call or ignore the character or include the character

        subseq(p + ch, up.substring(1));
        subseq(p, up.substring(1));
    }
}
//this is for string