package pers.linus.array.Container_With_Most_Water_11;

public class Solution {
    public int maxArea(int[] height) {
        int res = 0;
        int left = 0;
        int right = height.length - 1;
        while (left < right) {
            res = Math.max(res, Math.min(height[left], height[right]) * (right - left));
            if (height[left] < height[right]) {
                left++;
            }
            else {
                while (left < right) {
                    right--;
                    res = Math.max(res, Math.min(height[left], height[right]) * (right - left));
                    if (height[left] < height[right]) {
                        left++;
                        break;
                    }
                }
            }
        }
        return res;
    }
}