class node_n {
    int data;
    node_n next;

    node_n(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Main {
    public static void main(String[] args) {

        
        node_n n1 = new node_n(10);
        node_n n2 = new node_n(20);
        node_n n3 = new node_n(30);
        node_n n4 = new node_n(40);
        node_n n5 = new node_n(50);

        
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;


        int temp = n3.data;
        n3.data = n4.data;
        n4.data = temp;


       
        node_n temp = n1;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
