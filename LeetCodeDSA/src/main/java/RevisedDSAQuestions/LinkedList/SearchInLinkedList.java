package RevisedDSAQuestions.LinkedList;

public class SearchInLinkedList {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next= new Node(5);
        head.next.next.next = new Node(15);
        System.out.print(printNode(head, 20));
    }
    static int printNode(Node head, int x){
       int pos= 1;
       Node curr = head;

       while (curr!= null){
           if(curr.data== x){
               return pos;
           }
           else {
               pos++;
               curr= curr.next;
           }
       }
       return  -1;
    }
}
