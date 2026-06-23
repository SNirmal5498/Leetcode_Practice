/*
Approach:
1. Traverse the array from index 1.
2. Add the previous element to the current element.
3. Update the current element with the running sum.
4. Return the updated array.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }
        return nums;
    }
}