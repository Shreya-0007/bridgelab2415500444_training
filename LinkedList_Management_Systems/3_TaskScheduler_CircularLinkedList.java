
class Task {
    int id;
    Task next;
    Task(int i){ id=i; }
}

public class TaskScheduler {
    static Task head;

    static void add(int id){
        Task t=new Task(id);
        if(head==null){ head=t; t.next=head; return; }
        Task temp=head;
        while(temp.next!=head) temp=temp.next;
        temp.next=t; t.next=head;
    }

    static void display(){
        if(head==null) return;
        Task temp=head;
        do{
            System.out.println("Task "+temp.id);
            temp=temp.next;
        }while(temp!=head);
    }

    public static void main(String[] args){
        add(1);
        add(2);
        display();
    }
}
