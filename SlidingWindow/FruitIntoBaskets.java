/*
Approach:
1. Initialize a sliding window using two pointers.
2. Add the current fruit to the HashMap.
3. If the window contains more than 2 fruit types, shrink the window.
4. Remove a fruit type from the HashMap if its count becomes 0.
5. Update the maximum window size.
6. Return the maximum number of fruits collected.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int totalFruit(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int l = 0;
        int max = 0;

        for (int r = 0; r < arr.length; r++) {

            map.put(arr[r], map.getOrDefault(arr[r], 0) + 1);

            while (map.size() > 2) {
                int num = arr[l];
                map.put(num, map.get(num) - 1);

                if (map.get(num) == 0) {
                    map.remove(num);
                }

                l++;
            }

            if (map.size() <= 2) {
                int sum = 0;

                for (int num : map.values()) {
                    sum += num;
                }

                max = Math.max(max, sum);
            }
        }

        return max;
    }
}