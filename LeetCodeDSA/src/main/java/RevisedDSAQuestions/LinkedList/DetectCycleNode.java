package RevisedDSAQuestions.LinkedList;

public class DetectCycleNode {
    public static void main(String[] args) {
    Node head = new Node(10);
    head.next = new Node(20);
    head.next.next = new Node(5);
    head.next.next.next = new Node(15);
    System.out.println(cycleInListNode(head));
    printList(head);
}
static Node cycleInListNode(Node head){
    Node slow = head;
    Node fast = head;
    boolean isCycle = false;
    while(fast!=null && fast.next != null){
        slow = slow.next;
        fast= fast.next.next;
        if(slow==fast){
            isCycle= true;
        }
    }
    if(!isCycle){
        return null;
    }
    slow = head;

    while(slow!= fast){
        slow= slow.next;
        fast= fast.next;
    }
    return slow;

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
