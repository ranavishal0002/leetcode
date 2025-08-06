package RevisedDSAQuestions.LinkedList;

import static RevisedDSAQuestions.LinkedList.InsertAtNPosition.printList;

public class DeleteEnd {
        public static void main(String[] args) {
            Node head = new Node(10);
            head.next = new Node(20);
            head.next.next= new Node(5);
            head.next.next.next = new Node(15);
            head = delNodeLast(head);
            printList(head);
        }
        static Node delNodeLast(Node head){
            if(head== null || head.next== null){
                return null;
            }
            Node curr = head;

            while(curr.next.next!=null){
                curr= curr.next;
            }
            curr.next = null;

            return head;
    }

    static void printList(Node head){
            Node curr = head ;
            while(curr!=null){
                System.out.print(curr.data+" ");
                curr = curr.next;
            }
    }
}

/**
 * this is the one way


 if(head==null){
 return null;
 }
 int len  =0;
 Node cur = head;
 while(cur!=null){
 len++;
 cur= cur.next;
 }
 System.out.println(len+"  this is the length of the list");

 Node curr = head;
 for(int i =1; i<len-1; i++){
 curr= curr.next;
 }
 curr.next = null;

 return head;
 */