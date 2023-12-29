package LetterCombinationof_PhoneNumber;

import java.util.ArrayList;

public class Dice_Problem_Amzon {
    public static void main(String[] args) {
        dice("", 4);
        System.out.println(diceRet("", 4));

    }

    static void dice(String p, int target) {
        if (target == 0) {
            System.out.println(p);
            return;
        }

        for (int i = 1; i <= 6 && i <= target; i++) {
            dice(p + i, target - i);
        }


    }
//    static int diceFace(String p, int target, int face ) {
//        if (target == 0) {  //More than 6 dices like 7 or 8
//            System.out.println(p);
//            return 1;
//        }
//
//        for (int i = 1; i < -face && i <= target; i++) {
//            diceFace(p + i, target - i, face);
//        }
//    }

    static ArrayList<String> diceRet(String p, int target) {
        if (target == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        for (int i = 1; i <= 6 && i <= target; i++) {
            list.addAll(diceRet(p + i, target - i));
        }
        return list;
    }
}


