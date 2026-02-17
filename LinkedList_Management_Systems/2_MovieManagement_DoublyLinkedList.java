
class Movie {
    String title;
    Movie prev, next;
    Movie(String t){ title=t; }
}

public class MovieManagement {
    static Movie head, tail;

    static void add(String t){
        Movie m=new Movie(t);
        if(head==null){ head=tail=m; return; }
        tail.next=m; m.prev=tail; tail=m;
    }

    static void display(){
        Movie temp=head;
        while(temp!=null){
            System.out.println(temp.title);
            temp=temp.next;
        }
    }

    public static void main(String[] args){
        add("Inception");
        add("Avatar");
        display();
    }
}
