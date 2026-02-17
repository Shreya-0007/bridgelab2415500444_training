
class Ticket {
    int id;
    Ticket next;
    Ticket(int i){ id=i; }
}

public class TicketReservation {
    static Ticket head;

    static void add(int id){
        Ticket t=new Ticket(id);
        if(head==null){ head=t; t.next=head; return; }
        Ticket temp=head;
        while(temp.next!=head) temp=temp.next;
        temp.next=t; t.next=head;
    }

    static void display(){
        if(head==null) return;
        Ticket temp=head;
        do{
            System.out.println("Ticket "+temp.id);
            temp=temp.next;
        }while(temp!=head);
    }

    public static void main(String[] args){
        add(1);
        add(2);
        display();
    }
}
