/*
Approach:
1. Initialize two pointers:
   - i = start of string s
   - j = start of string t
2. Compare the characters at both pointers.
3. If they match, move both pointers.
4. Otherwise, move only the pointer in t.
5. If i reaches the end of s, return true.
6. Otherwise, return false.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;

        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
                j++;
            } else {
                j++;
            }
        }

        return i == s.length();
    }
}