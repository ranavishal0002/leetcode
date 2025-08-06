package RevisedDSAQuestions.LinkedList;

public class RerverseLinkedList {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(5);
        head.next.next.next = new Node(15);
        head = reverseList(head);
        printList(head);
    }

    static Node reverseList(Node head){
        Node prev = null;
        Node curr = head;

        while(curr!=null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    static void printList(Node head){
        Node curr = head;
        while (curr != null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

}
