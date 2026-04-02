import java.util.*;
class PairWithGivenSum {
    static boolean findPair(int arr[], int target) {
        HashSet<Integer> set = new HashSet<>();
        for (int x : arr) {
            if (set.contains(target - x))
                return true;
            set.add(x);
        }
        return false;
    }
}
