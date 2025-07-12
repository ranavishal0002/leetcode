package RevisedDSAQuestions.LinkedList;

import java.util.*;

class Node {
    int data;
    Node next;
    Node(int x){
        data = x;
        next = null;
    }
}
public class PrintLinkedList {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        printList(head);
        recursivePrinLinkedList(head);
    }

    private static void recursivePrinLinkedList(Node head) {
        if(head == null)
            return;
        System.out.println(head.data);
        recursivePrinLinkedList(head.next);
    }

    public static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }

}
