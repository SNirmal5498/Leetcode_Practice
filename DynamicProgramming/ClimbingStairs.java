/*
Approach:
1. Handle the base cases for n = 0 and n = 1.
2. Initialize:
   - a = ways to reach step 1
   - b = ways to reach step 2
3. Calculate the number of ways for each step using the previous two values.
4. Update the variables.
5. Return the final answer.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int climbStairs(int n) {
        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        int a = 1, b = 2;

        for (int i = 3; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }

        return b;
    }
}