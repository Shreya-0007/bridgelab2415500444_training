import java.util.*;
class TwoSum {
    static int[] solve(int arr[], int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int diff = target - arr[i];
            if (map.containsKey(diff))
                return new int[]{map.get(diff), i};
            map.put(arr[i], i);
        }
        return new int[]{-1, -1};
    }
}
