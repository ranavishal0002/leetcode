package RevisedDSAQuestions.LinkedList;

public class DetectCycle {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(5);
        head.next.next.next = new Node(15);
        System.out.println(cycleInList(head));
        printList(head);
    }
    static boolean cycleInList(Node head){
        Node slow = head;
        Node fast = head;

        while(fast!=null && fast.next != null){
            slow = slow.next;
            fast= fast.next.next;

            if(slow==fast){
                return  true;
            }
        }
        return false;
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
