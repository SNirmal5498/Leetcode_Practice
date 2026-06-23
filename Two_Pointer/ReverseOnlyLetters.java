/*
Approach:
1. Convert the string to a character array.
2. Initialize two pointers:
   - i = start of the array
   - j = end of the array
3. If arr[i] is not a letter, move i forward.
4. If arr[j] is not a letter, move j backward.
5. Otherwise, swap both letters.
6. Repeat until both pointers meet.
7. Convert the character array back to a string.

Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    public String reverseOnlyLetters(String s) {
        char arr[] = s.toCharArray();
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            if (!Character.isLetter(arr[i])) {
                i++;
            } else if (!Character.isLetter(arr[j])) {
                j--;
            } else {
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        return String.valueOf(arr);
    }
}