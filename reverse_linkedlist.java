public class reverse_linkedlist {
    static node_n head;

    static class node_n {
        int data;
        node_n next;

        node_n(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {

        
        head = new node_n(10);
        head.next = new node_n(20);
        head.next.next = new node_n(30);
        head.next.next.next = new node_n(40);
        head.next.next.next.next = new node_n(50);

        
        System.out.println("Original Linked List:");
        printList(head);

        
        head = reverseList(head);

        
        System.out.println("Reversed Linked List:");
        printList(head);
    }

    static node_n reverseList(node_n head) {
        node_n prev = null;
        node_n current = head;
        node_n next = null;

        while (current != null) {
            next = current.next; 
            current.next = prev; 
            prev = current; 
            current = next; 
        }
        return prev; 
    }

    static void printList(node_n head) {
        node_n temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    
}