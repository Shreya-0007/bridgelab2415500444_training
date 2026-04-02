public class application_stack {
        public static void main(String[] args) {
            stack<Integer> stack = new stack<>();
    
            stack.push(10);
            stack.push(20);
            stack.push(30);
    
            System.out.println("Top element: " + stack.peek());
    
            System.out.println("Popped element: " + stack.pop());
    
            System.out.println("Stack after popping: " + stack);
        }
}
