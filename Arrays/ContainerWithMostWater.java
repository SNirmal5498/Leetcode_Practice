/*
   link:->https://leetcode.com/problems/container-with-most-water
Approach:
1. Place one pointer at the beginning and one at the end.
2. Calculate the area using:
   - width = j - i
   - height = min(height[i], height[j])
3. Update the maximum area.
4. Move the pointer with the smaller height.
5. Repeat until both pointers meet.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        while (i < j) {
            min = Math.min(height[i], height[j]);
            max = Math.max(max, (j - i) * min);

            if (height[i] >= height[j]) {
                j--;
            } else {
                i++;
            }
        }

        return max;
    }
}