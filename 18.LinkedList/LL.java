package LinkedList;

public class LL {

    private Node head;
    private Node tail;

    private int size;
    public LL() {
        this.size=0;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail== null) {
            tail=head;
        }
        size +=1;
    }

    //Inserting at the last index or tail
    public void insertLast(int val){
        if (tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new  Node(val);
        tail.next =node;
        tail = node;
        size++;
    }

    //Inserting value at particular index insertion of singely linked list
    public void insert(int val, int index){
        if(index==0){
            insertFirst(val);
            return;
        }
        if(index==size){
            insertLast(val);
            return;
        }
        Node temp = head;
        for (int i=1; i<index; i++){
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;

        size++;

    }

    //insert using Recursion

    public void inserRec(int val, int index){
        head = insertRec(val, index, head);
    }
    private Node insertRec(int val, int index, Node node){
        if(index == 0){
            Node temp = new Node(val, node);
            size++;
            return temp;
        }
        node.next = insertRec(val, --index, node.next);
        //that is 5->9 3.next = 5
        return node;
    }








    //If we want to delete the last element and assigning it to null or tail
    public int deleteLast(){
        if (size <= 1){
            return deleteFirst();
        }
        Node secondLast = get(size-2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        return val;

    }

    //deleting the particular index
    public  int delete(int index){
        if(index == 0){
            return deleteFirst();
        }
        if (index == size-1){
            return deleteLast();
        }
        //for exaple 3->4>->5 so we go to 5 and come back as index-1
        Node prev = get(index - 1);
        int val = prev.next.value;

        //need to break the chain
        prev.next = prev.next.next;

        return val;

    }


    //returns the referance value of that number complexity 0(n)
    public Node find(int value){
        Node node = head;
        while (node!=null){
            if(node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }





    //returns the referance index of that number
    public Node get(int index){
        Node node = head;
        for (int i=0; i<index; i++){
            node = node.next;
        }
        return node;
    }

    //Deleting of particular node
    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return val;
    }

    public  void display() {
        Node temp = head;
        while( temp!= null) {
            System.out.println(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
    private class  Node {
        private int value;
        private Node next;

        public  Node(int value)  {
            this.value = value;
        }
        public Node(int value, Node next){
            this.value = value;
            this.next =next;
        }
    }





    //questions
//remove duplicates
    public void duplicates(){
        Node node= head;

        //we can apply for loop we dont know how many elements
        while( node.next != null){
            if(node.next != null && node.value == node.next.value){
                node.next = node.next.next;
                size--;
            } else {
                node = node.next;
            }
        }
        tail=node;
        tail.next=null;

    }


    //21 leetcode Merge two sorted list
    public void bubbleSort() {
        bubbleSort(size - 1, 0);
    }

    private void bubbleSort(int row, int col) {
        if (row == 0) {
            return;
        }
        if (col < row) {
            Node first = get(col);
            Node second = get(col + 1);

            if (first.value > second.value) {
                // swap
                head = second;
                first.next = second.next;
                second.next = first;
            } else if (second == tail) {
                Node prev = get(col - 1);
                prev.next = second;
                tail = first;
                first.next = null;
                second.next = tail;
            } else {
                Node prev = get(col - 1);
                prev.next = second;
                first.next = second.next;
                second.next = first;
            }
        }
        bubbleSort(row, col + 1);
    }
}





//    public static void main(String[] args) {
////        LL list = new LL();
////        list.insertLast(1);
////        list.insertLast(1);
////        list.insertLast(2);
////        list.insertLast(3);
////        list.insertLast(3);
////        list.display();
////
////        list.duplicates();
////        list.display();
//
//        LL first = new LL();
//        LL second = new LL();
//
//        first.insertLast(1);
//        first.insertLast(3);
//        first.insertLast(5);
//
//        second.insertLast(1);
//        second.insertLast(2);
//        second.insertLast(9);
//        second.insertLast(14);
//
//        LL ans = LL.merge(first, second);
//        ans.display();
//    }
//}
//



