
class Item {
    int id, qty;
    double price;
    Item next;
    Item(int i,int q,double p){ id=i; qty=q; price=p; }
}

public class InventoryManagement {
    static Item head;

    static void add(int id,int q,double p){
        Item item=new Item(id,q,p);
        item.next=head;
        head=item;
    }

    static double total(){
        double sum=0;
        Item temp=head;
        while(temp!=null){
            sum+=temp.qty*temp.price;
            temp=temp.next;
        }
        return sum;
    }

    public static void main(String[] args){
        add(1,10,5);
        add(2,5,50);
        System.out.println("Total: "+total());
    }
}
