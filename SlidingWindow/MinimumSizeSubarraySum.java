/*
Approach:
1. Initialize a sliding window using two pointers.
2. Expand the window by adding elements to the sum.
3. While the sum is greater than or equal to the target:
   - Update the minimum window size.
   - Remove the left element from the sum.
   - Move the left pointer.
4. Return the minimum length if found, otherwise return 0.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l = 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;

        for (int r = 0; r < nums.length; r++) {
            sum += nums[r];

            while (sum >= target) {
                min = Math.min(min, r - l + 1);
                sum -= nums[l];
                l++;
            }
        }

        return min == Integer.MAX_VALUE ? 0 : min;
    }
}