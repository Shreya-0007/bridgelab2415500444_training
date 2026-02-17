
class Book {
    int id;
    Book prev,next;
    Book(int i){ id=i; }
}

public class LibraryManagement {
    static Book head,tail;

    static void add(int id){
        Book b=new Book(id);
        if(head==null){ head=tail=b; return; }
        tail.next=b; b.prev=tail; tail=b;
    }

    static void display(){
        Book temp=head;
        while(temp!=null){
            System.out.println("Book "+temp.id);
            temp=temp.next;
        }
    }

    public static void main(String[] args){
        add(1);
        add(2);
        display();
    }
}
