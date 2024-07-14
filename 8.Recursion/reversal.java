package Recursion;


///Reverse a number using recursion

public class reversal {

        static int sum = 0;
        static void rev1 ( int n){
            if (n == 0) {
                return;
            }
            int rem = n % 10;
            sum = sum * 10 + rem;
            rev1(n / 10);
        }
        public static void main (String[] args){
            rev1(1234);
            System.out.println(sum);
        }
    }

    //iteration method
//    public class reversal {
//        public static void main(String[] args) {
//            int n = 1234;
//            int sum = 0;
//            while (n > 0) {
//                int rem = n % 10;
//                sum = sum * 10 + rem;

//                n = n / 10;
//            }
//            System.out.println(sum);
//        }
//    }
//}
//Output: 4321