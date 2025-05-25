import java.io.*;
import java.util.*;

public class add_last {
    public static class Node {
        int data;
        Node next;
    }

    public static class LinkedList {
        Node head;
        Node tail;
        int size;

        void addlast(int val) {
            Node temp = new Node();
            temp.data = val;
            temp.next = null;

            if (size == 0) {
                head = tail = temp;
            } else {
                tail.next = temp;  
                tail = temp;       
            }
            size++;
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

    }

    public static void main(String[] args) throws IOException {
        LinkedList list = new LinkedList();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements to insert:");
        int n = sc.nextInt();

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            list.addlast(val);
        }

        // Display the list
        System.out.println("Linked List:");
        list.display();

    }
}
