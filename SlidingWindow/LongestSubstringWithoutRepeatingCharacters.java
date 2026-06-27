/*
Approach:
1. Initialize a sliding window using two pointers.
2. Use a HashSet to store unique characters in the current window.
3. Expand the window by moving the right pointer.
4. If a duplicate character is found, shrink the window from the left.
5. Add the current character to the HashSet.
6. Update the maximum window length.
7. Return the maximum length.

Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0;
        int max = 0;
        Set<Character> set = new HashSet<>();

        for (int r = 0; r < s.length(); r++) {

            while (set.contains(s.charAt(r))) {
                set.remove(s.charAt(l));
                l++;
            }

            set.add(s.charAt(r));
            max = Math.max(max, (r - l) + 1);
        }

        return max;
    }
}