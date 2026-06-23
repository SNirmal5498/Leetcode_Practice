/*
Approach:
1. Remove extra spaces and split the string into words.
2. Initialize two pointers:
   - i = start of the array
   - j = end of the array
3. Swap the words at both pointers.
4. Repeat until both pointers meet.
5. Join the words with a single space.
6. Return the final string.

Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    public String reverseWords(String s) {
        String arr[] = s.trim().split("\\s+");

        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            String temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        String str = String.join(" ", arr);

        return str;
    }
}