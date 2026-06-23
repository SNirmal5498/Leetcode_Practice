/*
Approach:
1. Sort the array.
2. Check if the first element is 0.
   - If not, return 0.
3. Traverse the sorted array.
4. If the difference between consecutive elements is not 1, return the missing number.
5. If no number is missing in between, return the last element + 1.

Time Complexity: O(n log n)
Space Complexity: O(1)
*/

import java.util.Arrays;

class Solution {
    public int missingNumber(int[] nums) {

        Arrays.sort(nums);

        if (nums[0] != 0) {
            return 0;
        }

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1] + 1) {
                return nums[i] - 1;
            }
        }

        return nums[nums.length - 1] + 1;
    }
}