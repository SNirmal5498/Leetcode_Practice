/*
Approach:
1. Create a HashMap to store the frequency of each element.
2. Traverse the array and update the frequency.
3. Traverse the HashMap entries.
4. If an element appears only once, add it to the sum.
5. Return the sum.

Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    public int sumOfUnique(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> en : map.entrySet()) {
            if (en.getValue() == 1) {
                sum += en.getKey();
            }
        }

        return sum;
    }
}