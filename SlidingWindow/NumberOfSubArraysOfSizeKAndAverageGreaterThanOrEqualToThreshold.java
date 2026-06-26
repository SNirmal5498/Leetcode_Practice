/*
Approach:
1. Calculate the sum of the first window of size k.
2. Check if the average is greater than or equal to the threshold.
3. Slide the window by removing the left element and adding the next element.
4. Check the average for each new window.
5. Count the valid subarrays.
6. Return the count.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int i = 0;
        int j = k - 1;
        int c = 0;
        int sum = 0;

        for (int l = i; l <= j; l++) {
            sum += arr[l];
        }

        if ((sum / k) >= threshold) {
            c++;
        }

        while (j < arr.length - 1) {
            sum -= arr[i];
            sum += arr[j + 1];

            if ((sum / k) >= threshold) {
                c++;
            }

            i++;
            j++;
        }

        return c;
    }
}