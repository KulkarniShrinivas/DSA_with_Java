package LinkedList;



//amzon and microsoft


public class CycleQuestions {
    // leetcode 141

    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    // find the length of the cycle
    public int lengthOfCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                // calculate length
                ListNode temp = slow;
                int length = 0;

                do {
                    temp = temp.next;
                    length++;
                } while (temp != slow);

                return length;
            }
        }
        return 0;
    }

    //leetcode 142 https://leetcode.com/problems/linked-list-cycle-ii/

    public  ListNode detectCycle(ListNode head) {
        int length =0;

        ListNode fast = head;
        ListNode slow= head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) {
                length = lengthOfCycle(slow);
                break;
            }

        }

        if(length == 0) {
            return  null;
        }
        //now need to find the start node
        ListNode f = head;
        ListNode s = head;

        // we have to move ahed length of cycle

        while (length > 0){
            s  = s.next;
            length--;
        }
        //keep  moving forward and they will meeet at cycle start
        while (f!=s){
            f= f.next;
            s = s.next;
        }

        return s;
    }


    //202 Happy Number https://leetcode.com/problems/happy-number/
    public boolean isHappy(int n){
        int slow = n;
        int fast = n;

        do{
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));

        }while (slow != fast);

        if(slow == 1){
            return true;
        }
        return  false;

    }

    private  int findSquare(int number){
        int ans = 0;
        while (number > 0){
            int rem = number % 10;
            ans += rem * rem;
            number /= 10;
        }
        return  ans;
    }




    //876 Middle of the Linked List https://leetcode.com/problems/middle-of-the-linked-list/

    public ListNode middleNode(ListNode head){
        ListNode s= head;
        ListNode f= head;

        while( f != null && f.next != null){
            s= s.next;
            f=f.next.next;
        }
        return s;
    }

}







//class ListNode {
//    int val;
//    ListNode next;
//}
