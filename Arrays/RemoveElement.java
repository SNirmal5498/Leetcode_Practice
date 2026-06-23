/*
Approach:
1. Initialize pos = 0.
2. Traverse the array.
3. If the current element is not equal to val, place it at pos.
4. Increment pos.
5. Return pos as the new length.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int removeElement(int[] nums, int val) {
        int pos = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[pos] = nums[i];
                pos++;
            }
        }

        return pos;
    }
}