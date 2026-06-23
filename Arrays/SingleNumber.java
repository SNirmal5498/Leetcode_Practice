/*
Approach:
1. Initialize result as 0.
2. Traverse the array.
3. Perform XOR with each element.
4. Duplicate elements cancel each other.
5. The remaining value is the single number.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;

        for (int num : nums) {
            result = result ^ num;
        }

        return result;
    }
}