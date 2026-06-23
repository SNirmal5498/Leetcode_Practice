/*
Approach:
1. Create a HashSet to store elements.
2. Traverse the array.
3. If the current element is already in the HashSet, return true.
4. Otherwise, add the element to the HashSet.
5. If no duplicates are found, return false.

Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
        }

        return false;
    }
}