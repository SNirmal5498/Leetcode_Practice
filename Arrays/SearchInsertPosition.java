/*
   link:->  https://leetcode.com/problems/search-insert-position/description/

Approach:
1. Traverse the array from left to right.
2. Check if the current element is greater than or equal to the target.
3. If found, return the current index.
4. If no such element exists, return nums.length.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {
                return i;
            }
        }
        return nums.length;
    }
}