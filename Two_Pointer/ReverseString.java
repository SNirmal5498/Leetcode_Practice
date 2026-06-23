/*
Approach:
1. Initialize two pointers:
   - st = 0
   - e = last index
2. Swap the characters at both pointers.
3. Move st forward and e backward.
4. Repeat until both pointers meet.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public void reverseString(char[] s) {
        int st = 0;
        int e = s.length - 1;

        while (st < e) {
            char temp = s[st];
            s[st] = s[e];
            s[e] = temp;

            st++;
            e--;
        }
    }
}