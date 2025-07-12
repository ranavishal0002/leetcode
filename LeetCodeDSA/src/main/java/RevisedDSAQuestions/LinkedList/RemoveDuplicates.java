package RevisedDSAQuestions.LinkedList;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(20);
        head.next.next.next = new Node(30);
        head.next.next.next.next = new Node(30);
       head = removeRepeatedNode(head);
       printList(head);
    }
    static Node removeRepeatedNode(Node head){
        Node curr = head;
        while(curr!=null && curr.next!= null){
            if(curr.data == curr.next.data){
                curr.next = curr.next.next;
            } else {
                curr= curr.next;
            }
        }
        return head;

    }
    static void printList(Node head){
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + "  ");
            curr = curr.next;
        }
    }
    }

