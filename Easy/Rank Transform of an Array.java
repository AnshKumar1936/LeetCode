import java.util.*;

public class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] dup = Arrays.copyOf(arr, arr.length);
        Arrays.sort(dup);
        Map<Integer, Integer> mp = new HashMap<>();
        mp.put(dup[0], 1);
        for (int i = 1; i < dup.length; i++) {
            if (dup[i] > dup[i - 1]) {
                mp.put(dup[i], mp.get(dup[i - 1]) + 1);
            } else {
                mp.put(dup[i], mp.get(dup[i - 1]));
            }
        }
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[i] = mp.get(arr[i]);
        }
        return res;
    }
}
