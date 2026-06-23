/*
Approach:
1. Traverse each element in the array.
2. Count the number of digits in the current element.
3. If the digit count is even, increment the answer.
4. Return the total count.

Time Complexity: O(n × d)
Space Complexity: O(1)
*/

class Solution {
    public int findNumbers(int[] nums) {
        int n = 0;

        for (int ss : nums) {
            int count = 0;

            while (ss > 0) {
                ss = ss / 10;
                count++;
            }

            if (count % 2 == 0) {
                n++;
            }
        }

        return n;
    }
}