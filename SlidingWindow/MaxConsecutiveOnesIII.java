/*
Approach:
1. Initialize two pointers:
   - l = left pointer
   - r = right pointer
2. Expand the window by moving r.
3. Count the number of zeros in the current window.
4. If zeros exceed k, shrink the window from the left.
5. Update the maximum window size.
6. Return the maximum length.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int longestOnes(int[] nums, int k) {
        int l = 0;
        int max = 0;
        int z = 0;

        for (int r = 0; r < nums.length; r++) {
            if (nums[r] == 0) {
                z++;
            }

            while (z > k) {
                if (nums[l] == 0) {
                    z--;
                }
                l++;
            }

            max = Math.max(max, (r - l) + 1);
        }

        return max;
    }
}