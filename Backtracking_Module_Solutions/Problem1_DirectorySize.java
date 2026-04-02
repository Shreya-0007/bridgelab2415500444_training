
import java.io.File;
import java.util.HashSet;
import java.util.Set;

public class Problem1_DirectorySize {

    public static long getDirectorySize(File file, Set<String> visited) {
        if (file == null || !file.exists()) return 0;

        // Handle symbolic links / cycles
        try {
            String canonicalPath = file.getCanonicalPath();
            if (visited.contains(canonicalPath)) return 0;
            visited.add(canonicalPath);
        } catch (Exception e) {
            return 0;
        }

        if (file.isFile()) {
            return file.length(); // Base case
        }

        long size = 0;
        File[] files = file.listFiles();
        if (files != null) {
            for (File f : files) {
                size += getDirectorySize(f, visited); // Recursive case
            }
        }
        return size;
    }

    public static void main(String[] args) {
        File directory = new File("project");
        long totalSize = getDirectorySize(directory, new HashSet<>());
        System.out.println("Total Directory Size: " + totalSize + " bytes");
    }
}
