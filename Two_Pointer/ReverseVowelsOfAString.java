/*
Approach:
1. Convert the string to a character array.
2. Initialize two pointers:
   - st = 0
   - e = last index
3. Move st until a vowel is found.
4. Move e until a vowel is found.
5. Swap both vowels.
6. Repeat until both pointers meet.
7. Convert the character array back to a string.

Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    public boolean isV(char ch) {
        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U');
    }

    public String reverseVowels(String s) {
        int st = 0;
        int e = s.length() - 1;
        char arr[] = s.toCharArray();

        while (st < e) {
            if (!isV(arr[st])) {
                st++;
            } else if (!isV(arr[e])) {
                e--;
            } else {
                char temp = arr[st];
                arr[st] = arr[e];
                arr[e] = temp;
                st++;
                e--;
            }
        }

        return String.valueOf(arr);
    }
}