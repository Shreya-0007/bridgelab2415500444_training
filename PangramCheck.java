public class PangramCheck {
    public static void main(String[] args) {

        String str = "hii my name is shreya";

        boolean[] present = new boolean[26];
        int count = 0;

        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                if (!present[ch - 'a']) {
                    present[ch - 'a'] = true;
                    count++;
                }
            }
        }

        if (count == 26)
            System.out.println("Pangram");
        else
            System.out.println("Not Pangram");
    }
}

    
