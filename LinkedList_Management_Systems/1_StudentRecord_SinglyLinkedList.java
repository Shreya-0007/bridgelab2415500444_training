
class Student {
    int roll;
    String name;
    int age;
    String grade;
    Student next;

    Student(int r, String n, int a, String g) {
        roll = r; name = n; age = a; grade = g;
    }
}

public class StudentRecordManagement {
    static Student head;

    static void add(int r, String n, int a, String g) {
        Student s = new Student(r,n,a,g);
        s.next = head;
        head = s;
    }

    static void display() {
        Student temp = head;
        while(temp != null) {
            System.out.println(temp.roll + " " + temp.name + " " + temp.grade);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        add(1,"Shreya",20,"A");
        add(2,"Riya",21,"B");
        display();
    }
}
