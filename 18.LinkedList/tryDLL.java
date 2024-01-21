package LinkedList;

import org.w3c.dom.Node;

public class tryDLL {
    private Node head;

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev= null;
        if(head != null){
            head.prev= node;
        }
        head = node;
    }

    public void insertLast(int val){
        Node node = new Node(val);
        Node last = head;

        node.next = null;

        if(head == null){
            node.prev = null;
            head=node;
            return;
        }
        while(last.next != null){
            last = last.next;
        }
        last.next = node;
        node.prev= last;
    }
    public void display(){
        Node node = head;
        Node last= null;
        while(node != null){
            System.out.println(node.val + " -> ");
            last=node;
            node = node.next;
        }
        System.out.println("END");
    }


    private class Node{
        int val;
        Node next;
        Node prev;

        public Node(int val){
            this.val=val;
        }

        public Node(int val, Node next, Node prev){
            this.val=val;
            this.next=next;
            this.prev=prev;
        }
    }
}
