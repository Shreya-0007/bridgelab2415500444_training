import java.util.*;

class QueueUsingList {
    ArrayList<Integer> list = new ArrayList<>();


    public void enqueue(int x) {
        list.add(x);  
    }


    public int dequeue() {
        if (list.isEmpty()) {
            return -1;
        }
        return list.remove(0);     
    }

 
    public int peek() {
        if (list.isEmpty()) {
            return -1;
        }
        return list.get(0);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }
}
