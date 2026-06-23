/*
Approach:
1. Traverse the array.
2. Replace each element with its square.
3. Sort the squared array.
4. Return the sorted array.

Time Complexity: O(n log n)
Space Complexity: O(1)
*/

import java.util.Arrays;

class Solution {
    public int[] sortedSquares(int[] nums) {
        int i = 0;

        for (int num : nums) {
            nums[i] = num * num;
            i++;
        }

        Arrays.sort(nums);

        return nums;
    }
}