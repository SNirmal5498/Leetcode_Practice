/*
Approach:
1. Calculate the sum of ASCII values of all characters in t.
2. Subtract the ASCII values of all characters in s.
3. The remaining value is the extra character.
4. Convert the ASCII value to a character and return it.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public char findTheDifference(String s, String t) {
        int to = 0;

        for (int num : t.toCharArray()) {
            to += num;
        }

        for (int num : s.toCharArray()) {
            to -= num;
        }

        return (char) to;
    }
}