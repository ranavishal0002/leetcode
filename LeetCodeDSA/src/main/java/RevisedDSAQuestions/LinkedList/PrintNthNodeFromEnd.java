package RevisedDSAQuestions.LinkedList;

public class PrintNthNodeFromEnd {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(5);
        head.next.next.next = new Node(15);
        printNthNode(head, 2);
//        printHead(head);
    }
    static void printNthNode(Node head, int pos){
        // firstly find length of linked list
        int len =0;

        Node cur = head;
        while (cur!=null){
            len++;
            cur= cur.next;
        }
        System.out.println(len);

        Node curr = head;
        if(len<pos){
            return;
        }

        for(int i=0; i<len-pos; i++){
            curr= curr.next;
        }
        System.out.println(curr.data);
    }
}
