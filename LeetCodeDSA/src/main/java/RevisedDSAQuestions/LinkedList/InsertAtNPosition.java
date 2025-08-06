
package RevisedDSAQuestions.LinkedList;
public class InsertAtNPosition {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(5);
        head.next.next.next = new Node(15);

        head = insertAtPosition(head, 2, 30);  // Insert 30 at position 2
        printList(head);                      // Print the updated list
    }

    static Node insertAtPosition(Node head, int pos, int data) {
        Node temp = new Node(data);
        if (pos == 1) {
            temp.next = head;
            return temp;
        }
        Node curr = head;
        for (int i = 1; i <pos - 1 && curr != null; i++) {
            curr = curr.next;
        }
        // If position is beyond list length, return original head
        if (curr == null) return head;

        temp.next = curr.next;
        curr.next = temp;
        return head;
    }

    static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + "  ");
            curr = curr.next;
        }
//        System.out.println();
    }
}
