package RevisedDSAQuestions.LinkedList;

public class InsertAtEnd {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(5);
        head.next.next.next = new Node(15);
        head = insertNewEnd(head, 2);
        printList(head);
    }
    static Node insertNewEnd(Node head, int val){
        Node temp = new Node(val);
        if (head== null){
            return temp;
        }
        Node curr= head;
        while(curr.next !=null){
            curr = curr.next;
        }
        curr.next= temp;
        return head;
    }
    static void printList(Node head){
        Node curr = head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
    }
}
