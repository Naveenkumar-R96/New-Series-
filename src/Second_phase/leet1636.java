package Second_phase;

import java.util.*;

public class leet1636 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 2, 3};

        // Step 1: Count frequency
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Step 2: Convert to list and sort
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }



        Collections.sort(list, (a, b) -> {
            int freqA = map.get(a);
            int freqB = map.get(b);
            if (freqA == freqB) {
                return b - a; // if same frequency → sort by value descending
            }
            return freqA - freqB; // otherwise sort by frequency ascending
        });

        // Step 3: Convert back to array
        int[] ans = new int[nums.length];
        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }

        // Print result
        System.out.println(Arrays.toString(ans));
    }
}
