/*
Approach:
1. Initialize a counter.
2. Traverse the array.
3. If the current employee's hours are greater than or equal to the target, increment the counter.
4. Return the total count.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count = 0;

        for (int num : hours) {
            if (num >= target) {
                count++;
            }
        }

        return count;
    }
}