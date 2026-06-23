/*
Approach:
1. Remove all non-alphanumeric characters.
2. Convert the string to lowercase.
3. Reverse the string.
4. Compare the original and reversed strings.
5. Return true if both are equal.

Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String rev = new StringBuilder(s).reverse().toString();

        return s.equals(rev);
    }
}