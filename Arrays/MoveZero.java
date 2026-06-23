/*
Approach:
1. Initialize a pointer `pos` to track the position of non-zero elements.
2. Traverse the array.
3. If the current element is non-zero, place it at `pos` and increment `pos`.
4. After placing all non-zero elements, fill the remaining positions with 0.
5. The array is updated in-place.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public void moveZeroes(int[] nums) {
        int pos = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[pos] = nums[i];
                pos++;
            }
        }

        for (int j = pos; j < nums.length; j++) {
            nums[j] = 0;
        }
    }
}