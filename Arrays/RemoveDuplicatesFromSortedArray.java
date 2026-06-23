/*
Approach:
1. Initialize pos = 1 to store the next unique element.
2. Traverse the array from index 1.
3. Compare the current element with the previous element.
4. If they are different, place the current element at pos.
5. Increment pos.
6. Return pos as the number of unique elements.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int removeDuplicates(int[] nums) {
        int pos = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[pos] = nums[i];
                pos++;
            }
        }

        return pos;
    }
}