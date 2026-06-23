/*
Approach:
1. Initialize low and high pointers.
2. Find the middle element.
3. If the middle element is the target, return its index.
4. If the target is greater, search the right half.
5. Otherwise, search the left half.
6. If the target is not found, return -1.

Time Complexity: O(log n)
Space Complexity: O(1)
*/

class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }
}