
class State {
    String text;
    State prev,next;
    State(String t){ text=t; }
}

public class UndoRedoEditor {
    static State current;

    static void add(String t){
        State s=new State(t);
        if(current!=null){ current.next=s; s.prev=current; }
        current=s;
    }

    static void undo(){ if(current!=null && current.prev!=null) current=current.prev; }
    static void redo(){ if(current!=null && current.next!=null) current=current.next; }
    static void show(){ if(current!=null) System.out.println(current.text); }

    public static void main(String[] args){
        add("Hello");
        add("Hello World");
        undo();
        show();
    }
}
