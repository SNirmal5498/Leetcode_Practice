/*
Approach:
1. Initialize count and max.
2. Traverse the array.
3. If the current element is 1, increment count.
4. Update max if count is greater.
5. If the current element is 0, reset count.
6. Return max.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int c = 0;
        int max = 0;

        for (int num : nums) {
            if (num == 1) {
                c++;
                max = Math.max(max, c);
            } else {
                c = 0;
            }
        }

        return max;
    }
}