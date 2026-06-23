/*
Approach:
1. Traverse the string from left to right.
2. Store the distance from the nearest character on the left.
3. Traverse the string from right to left.
4. Store the distance from the nearest character on the right.
5. Update each position with the minimum distance.
6. Return the distance array.

Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    public int[] shortestToChar(String s, char c) {
        int ans[] = new int[s.length()];
        int p = Integer.MIN_VALUE / 2;

        for (int i = 0; i < ans.length; i++) {
            if (s.charAt(i) == c) {
                p = i;
            }
            ans[i] = i - p;
        }

        p = Integer.MAX_VALUE / 2;

        for (int i = ans.length - 1; i >= 0; i--) {
            if (s.charAt(i) == c) {
                p = i;
            }
            ans[i] = Math.min(ans[i], p - i);
        }

        return ans;
    }
}