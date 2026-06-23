/*
Approach:
1. Check if both strings have the same length.
2. Store the frequency of each character from the first string in a HashMap.
3. Traverse the second string and decrease the frequency.
4. If a character is not present, return false.
5. Check if all frequencies are 0.
6. If yes, return true.

Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.HashMap;

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (char ch : t.toCharArray()) {
            if (!map.containsKey(ch)) {
                return false;
            }
            map.put(ch, map.get(ch) - 1);
        }

        for (int num : map.values()) {
            if (num != 0) {
                return false;
            }
        }

        return true;
    }
}