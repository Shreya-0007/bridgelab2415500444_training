public class ReverseStringSB {
    public static void main(String[] args) {
        String input = "hello";
        StringBuilder sb = new StringBuilder();
        sb.append(input);
        sb.reverse();
        System.out.println("Reversed: " + sb.toString());
    }
}
