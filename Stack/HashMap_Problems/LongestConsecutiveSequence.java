import java.util.*;
class LongestConsecutiveSequence {
    static int longest(int arr[]) {
        HashSet<Integer> set = new HashSet<>();
        for (int x : arr) set.add(x);

        int longest = 0;
        for (int x : arr) {
            if (!set.contains(x - 1)) {
                int curr = x, count = 1;
                while (set.contains(curr + 1)) {
                    curr++;
                    count++;
                }
                longest = Math.max(longest, count);
            }
        }
        return longest;
    }
}
