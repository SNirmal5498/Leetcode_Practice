/*
Approach:
1. Traverse the array of strings.
2. Reverse the current string.
3. Compare the original and reversed strings.
4. If both are equal, return the string.
5. If no palindrome is found, return an empty string.

Time Complexity: O(n × m)
Space Complexity: O(m)
*/

class Solution {
    public String firstPalindrome(String[] words) {
        for (int i = 0; i < words.length; i++) {
            String rev = new StringBuilder(words[i]).reverse().toString();

            if (words[i].equals(rev)) {
                return words[i];
            }
        }

        return "";
    }
}