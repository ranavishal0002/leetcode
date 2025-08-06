package RevisedDSAQuestions.LinkedList;

public class RemoveNthNodeFromEnd {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(5);
        head.next.next.next = new Node(15);
       head=  removeNthNode(head, 2);
         printHead(head);
    }
    static Node removeNthNode(Node head, int pos) {
       int len =0;

       Node run = head;
       while(run!=null){
           len++;
           run= run.next;
       }
        System.out.println(len+"  this is the length of the list");
       if(len==pos){
           return head.next;
       }
       Node curr = head;
       for(int i =0; i<len-pos-1; i++){
           curr= curr.next;
       }
       curr.next = curr.next.next;

       return head;
    }
    static void printHead(Node head){
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + "  ");
            curr = curr.next;
        }
    }
}
/*


 Node dummy = new Node(0);
        dummy.next = head;
        Node fast = dummy;
        Node slow = dummy;
        // Move fast pointer `pos` steps ahead
        for (int i = 0; i < pos; i++) {
            if (fast.next == null) return head; // Position out of bounds
            fast = fast.next;
        }

        // Move both pointers until fast reaches the end
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // Skip the target node
        slow.next = slow.next.next;

        return dummy.next; // New head (in case head was removed)
 */