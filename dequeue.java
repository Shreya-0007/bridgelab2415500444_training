class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class Deque {
    Node front;
    Node rear;

    void insertFront(int val) {
        Node newNode = new Node(val);

        if (front == null) {
            front = rear = newNode;
            return;
        }

        newNode.next = front;
        front.prev = newNode;
        front = newNode;
    }

   
    void insertRear(int val) {
        Node newNode = new Node(val);

        if (rear == null) {
            front = rear = newNode;
            return;
        }

        rear.next = newNode;
        newNode.prev = rear;
        rear = newNode;
    }

   
    void display() {
        Node temp = front;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }


    void deleteFront() {
        if (front == null) {
            System.out.println("Deque is empty");
            return;
        }

        if (front == rear) {
            front = rear = null;
            return;
        }

        front = front.next;
        front.prev = null;
    }   

    void deleteRear() {
        if (rear == null) {
            System.out.println("Deque is empty");
            return;
        }

        if (front == rear) {
            front = rear = null;
            return;
        }

        rear = rear.prev;
        rear.next = null;
    }
}

public class Main {
    public static void main(String[] args) {

        Deque dq = new Deque();

        dq.insertFront(10);
        dq.insertFront(5);
        dq.insertRear(20);
        dq.insertRear(30);

        System.out.print("Deque elements: ");
        dq.display();
    }
}