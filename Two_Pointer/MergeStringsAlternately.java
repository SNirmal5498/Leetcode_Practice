/*
Approach:
1. Convert both strings to character arrays.
2. Initialize two pointers for both strings.
3. Add one character from each string alternately.
4. If one string is longer, add the remaining characters.
5. Return the merged string.

Time Complexity: O(n + m)
Space Complexity: O(n + m)
*/

class Solution {
    public String mergeAlternately(String word1, String word2) {
        char arr1[] = word1.toCharArray();
        char arr2[] = word2.toCharArray();
        char ans[] = new char[arr1.length + arr2.length];

        int i = 0;
        int j = 0;
        int pos = 0;

        while (i < word1.length() && j < word2.length()) {
            ans[pos++] = arr1[i];
            i++;

            ans[pos++] = arr2[j];
            j++;
        }

        while (j < word2.length()) {
            ans[pos++] = arr2[j];
            j++;
        }

        while (i < word1.length()) {
            ans[pos++] = arr1[i];
            i++;
        }

        return String.valueOf(ans);
    }
}