/*
Approach:
1. Initialize counters for positive and negative numbers.
2. Traverse the array.
3. Increment the negative counter if the element is less than 0.
4. Increment the positive counter if the element is greater than 0.
5. Return the maximum of the two counters.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int maximumCount(int[] nums) {
        int pc = 0;
        int nc = 0;
        int max = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num < 0) {
                nc++;
            } else if (num > 0) {
                pc++;
            }
        }

        max = Math.max(nc, pc);
        return max;
    }
}