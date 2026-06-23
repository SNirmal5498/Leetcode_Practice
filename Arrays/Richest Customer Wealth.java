/*
Approach:
1. Traverse each customer's account.
2. Calculate the total wealth of the current customer.
3. Update the maximum wealth if the current sum is greater.
4. Return the maximum wealth.

Time Complexity: O(m × n)
Space Complexity: O(1)
*/

class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;

        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;

            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }

            if (sum > max) {
                max = sum;
            }
        }

        return max;
    }
}