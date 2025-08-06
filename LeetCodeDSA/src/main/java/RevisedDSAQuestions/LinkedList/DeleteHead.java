package RevisedDSAQuestions.LinkedList;

import static RevisedDSAQuestions.LinkedList.InsertAtNPosition.printList;

public class DeleteHead {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next= new Node(5);
        head.next.next.next = new Node(15);
        head = delNode(head);
        printList(head);
    }

    static Node delNode(Node head){
        Node curr = head;
        Node temp = head;
        if(head.next==null){
            return null;
        }
        return head.next;
    }

    static void printList(Node head){
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }
}

