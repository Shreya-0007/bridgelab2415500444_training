import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountWordInFile {
    public static void main(String[] args) {
        String target = "hello";
        int count = 0;

        try (BufferedReader br = new BufferedReader(new FileReader("input.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String w : words) {
                    if (w.equals(target)) {
                        count++;
                    }
                }
            }
            System.out.println("Occurrences of '" + target + "': " + count);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
