
class User {
    int id;
    User next;
    User(int i){ id=i; }
}

public class SocialMediaConnections {
    static User head;

    static void add(int id){
        User u=new User(id);
        u.next=head;
        head=u;
    }

    static void display(){
        User temp=head;
        while(temp!=null){
            System.out.println("User "+temp.id);
            temp=temp.next;
        }
    }

    public static void main(String[] args){
        add(1);
        add(2);
        display();
    }
}
