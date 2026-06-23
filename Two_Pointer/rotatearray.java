/*
Approach:
1. Find the effective rotation using k % n.
2. Reverse the entire array.
3. Reverse the first k elements.
4. Reverse the remaining elements.
5. The array is rotated by k positions.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        rotate1(nums, 0, n - 1);
        rotate1(nums, 0, k - 1);
        rotate1(nums, k, n - 1);
    }

    public static void rotate1(int[] nums, int st, int end) {
        while (st < end) {
            int temp = nums[st];
            nums[st] = nums[end];
            nums[end] = temp;
            st++;
            end--;
        }
    }
}