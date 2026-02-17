
class Process {
    int id;
    Process next;
    Process(int i){ id=i; }
}

public class RoundRobinScheduling {
    static Process head;

    static void add(int id){
        Process p=new Process(id);
        if(head==null){ head=p; p.next=head; return; }
        Process temp=head;
        while(temp.next!=head) temp=temp.next;
        temp.next=p; p.next=head;
    }

    static void display(){
        if(head==null) return;
        Process temp=head;
        do{
            System.out.println("Process "+temp.id);
            temp=temp.next;
        }while(temp!=head);
    }

    public static void main(String[] args){
        add(1);
        add(2);
        display();
    }
}
