package BinaryTree;

import java.util.Scanner;

public class BinaryTree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();
        tree.populate(scanner);
        tree.display();

    }

    public BinaryTree() {

    }

    private static class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node root;

    public void populate(Scanner scanner) {
        System.out.println("Enter the root node values:");
        int value = scanner.nextInt();
        root = new Node(value);
        populate(scanner, root);
    }

    private void populate(Scanner scanner, Node node) {
        System.out.println("Do you want to add left child of " + node.value + "? (yes/no)");
        boolean left = "yes".equalsIgnoreCase(scanner.next());
        if (left) {
            System.out.println("Enter the value of left child of " + node.value + ":");
            int value = scanner.nextInt();
            node.left = new Node(value); //create new node at left
            populate(scanner, node.left); //now it will call recursion for above node this is recursion node.left
        }
        System.out.println("Do you want to add right child of " + node.value + "? (yes/no)");
        boolean right = "yes".equalsIgnoreCase(scanner.next());
        if (right) {
            System.out.println("Enter the value of right child of " + node.value + ":");
            int value = scanner.nextInt();
            node.right = new Node(value);
            populate(scanner, node.right);
        }
    }

    public void display() {
        display(root, "");
    }

    private void display(Node node, String indent) {
        if (node == null) {
            return;
        }
        System.out.println(indent + node.value);
        display(node.left, indent + "  \t");
        display(node.right, indent + "  \t");
    }
}

//types of recursion
//1. Tail Recursion -: When the recursive call is the last statement in the function
//2. Head Recursion : When the recursive call is the first statement in the function
//3. Tree Recursion: When a function calls itself more than one time
//4. Indirect Recursion : When a function calls another function and that function calls the first function
//5. Nested Recursion : When a function calls itself with the parameter as a recursive call
//6. Backtracking : When a function calls itself with different parameters
//7. Mutual Recursion : When two functions call each other
//8. Binary Recursion : When a function calls itself twice
//9. Linear Recursion : When a function calls itself once
//10. Multiple Recursion : When a function calls itself more than one time
//11. Direct Recursion : When a function calls itself





