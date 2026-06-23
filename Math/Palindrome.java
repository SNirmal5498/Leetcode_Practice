/*
Approach:
1. Store the original number.
2. Reverse the digits of the number.
3. Compare the reversed number with the original.
4. If both are equal, return true.
5. Otherwise, return false.

Time Complexity: O(log n)
Space Complexity: O(1)
*/

class Solution {
    public boolean isPalindrome(int x) {
        int temp = x, rev = 0;

        while (temp > 0) {
            int dig = temp % 10;
            rev = rev * 10 + dig;
            temp /= 10;
        }

        if (x == rev) {
            return true;
        } else {
            return false;
        }
    }
}