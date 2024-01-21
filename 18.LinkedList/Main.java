package LinkedList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();

        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(8);
        list.insertFirst(17);
        list.insertLast(99);
        list.insert(100, 3);
        list.display();
        System.out.println(list.deleteFirst());
        list.display();
        System.out.println(list.deleteLast());
        list.display();

        System.out.println(list.delete(2));
        list.display();

        list.inserRec(88, 2);
        list.display();




        //Doubaly LL

//        DLL list = new DLL();
//        list.insertFirst(3);
//        list.insertFirst(2);
//        list.insertFirst(8);
//        list.insertFirst(17);
//
//        list.insertLast(99);
//
//        list.insert(8, 65);
//
//        list.display();

        //circular LL
//
//        CLL list = new CLL();
//        list.insert(23);
//        list.insert(3);
//        list.insert(19);
//        list.insert(75);
//        list.display();
//        list.delete(19);
//        list.display();



//        trial list = new trial();
//        list.insertFirst(3);
//        list.insertFirst(2);
//        list.insertFirst(8);
//        list.insertFirst(17);
//        list.insertLast(99);
//        list.display();
//        System.out.println(list.deleteLast());
////        list.display();
////        list.insert(100, 3);
//        list.display();

//        tryDLL list = new tryDLL();
//        list.insertFirst(3);
//        list.insertFirst(2);
//        list.insertFirst(8);
//        list.insertFirst(17);
//        list.display();
//        list.insertLast(99);
//        list.display();

//        tryCLL list = new tryCLL();
//        list.insert(8);
//        list.insert(9);
//        list.insert(2);
//        list.insert(7);
//        list.display();
//        list.insert(99);
//        list.delete(2);
//        list.display();



    }
}
//17 -7 ->8 ->9 ->END
//17 ->8 ->2 ->3 ->END