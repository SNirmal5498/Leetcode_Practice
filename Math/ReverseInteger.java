/*
Approach:
1. Initialize rev as 0.
2. Extract the last digit using % 10.
3. Append the digit to rev.
4. Remove the last digit from the number.
5. Check if rev is within the integer range.
6. Return rev, otherwise return 0.

Time Complexity: O(log n)
Space Complexity: O(1)
*/

class Solution {
    public int reverse(int x) {
        long rev = 0;

        while (x != 0) {
            int dig = x % 10;
            rev = rev * 10 + dig;
            x /= 10;
        }

        if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) {
            return 0;
        }

        return (int) rev;
    }
}