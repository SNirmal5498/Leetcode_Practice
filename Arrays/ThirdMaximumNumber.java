/*
Approach:
1. Store all unique elements in a TreeSet in descending order.
2. Copy the elements from the TreeSet to an ArrayList.
3. If there are fewer than 3 unique elements, return the largest element.
4. Otherwise, return the third largest element.

Time Complexity: O(n log n)
Space Complexity: O(n)
*/

import java.util.*;

class Solution {
    public int thirdMax(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>(Comparator.reverseOrder());

        for (int num : nums) {
            set.add(num);
        }

        ArrayList<Integer> list = new ArrayList<>();

        for (int num : set) {
            list.add(num);
        }

        if (list.size() < 3) {
            return list.get(0);
        }

        return list.get(2);
    }
}