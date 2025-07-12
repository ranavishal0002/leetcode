package RevisedDSAQuestions.LinkedList;

public class InsertAtBegin {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(5);
        head.next.next.next = new Node(15);
       head = insertNewHead(head, 2);
        printHead(head);
    }

    static Node insertNewHead(Node head, int val) {

        Node temp = new Node(val);
        if (head == null) {
//            temp.next = null;
            return temp;
        } else {
            temp.next = head;
            return temp;
        }
    }
        static void printHead(Node head){
            Node curr = head;
            while (curr != null) {
                System.out.print(curr.data + "  ");
                curr = curr.next;
            }
        }

    }

