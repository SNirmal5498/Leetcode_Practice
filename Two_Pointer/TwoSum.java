package Two_Pointer;

public class TwoSum-II {
    
}/*
Approach:
1. Since the array is sorted in non-decreasing order, use the two-pointer technique.
2. Initialize two pointers:
   - i = 0 (start of the array)
   - j = numbers.length - 1 (end of the array)
3. While i < j:
   - Calculate the sum = numbers[i] + numbers[j].
   - If sum > target, decrement j to reduce the sum.
   - If sum < target, increment i to increase the sum.
   - If sum == target, return the 1-based indices {i + 1, j + 1}.
4. If no pair is found, return an empty array.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;

        while (i < j) {
            int sum = numbers[i] + numbers[j];

            if (sum > target) {
                j--;
            } else if (sum < target) {
                i++;
            } else {
                return new int[]{i + 1, j + 1};
            }
        }

        return new int[]{};
    }
}
