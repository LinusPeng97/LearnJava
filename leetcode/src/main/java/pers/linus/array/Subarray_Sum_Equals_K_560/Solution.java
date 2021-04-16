package pers.linus.array.Subarray_Sum_Equals_K_560;

import java.util.HashMap;

public class Solution {
//    public int subarraySum(int[] nums, int k) {
//        int res = 0;
//        for (int start = 0; start < nums.length; start++) {
//            int curValue = 0;
//            for (int end = start; end < nums.length; end++) {
//                curValue += nums[end];
//                if (curValue == k) {
//                    res++;
//                }
//            }
//        }
//        return res;
//    }

    public int subarraySum(int[] nums, int k) {
        int count = 0, sum = 0;
        HashMap < Integer, Integer > map = new HashMap < > ();
        map.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (map.containsKey(sum - k))
                count += map.get(sum - k);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}