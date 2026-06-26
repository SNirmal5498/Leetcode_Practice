/*
Approach:
1. Count the number of white blocks in the first window of size k.
2. Store it as the minimum recolors required.
3. Slide the window by removing the left character and adding the next character.
4. Update the count of white blocks.
5. Update the minimum recolors.
6. Return the minimum value.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int minimumRecolors(String str, int k) {
        int i = 0;
        int j = k - 1;
        int min = Integer.MAX_VALUE;
        int w = 0;

        for (int l = i; l <= j; l++) {
            if (str.charAt(l) == 'W') {
                w++;
            }
        }

        min = Math.min(min, w);

        while (j < str.length() - 1) {
            if (str.charAt(i) == 'W') {
                w--;
            }

            if (str.charAt(j + 1) == 'W') {
                w++;
            }

            i++;
            j++;

            min = Math.min(min, w);
        }

        return min;
    }
}