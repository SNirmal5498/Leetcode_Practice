/*
Approach:
1. Check if the array length is less than k.
2. Create the first window of size k.
3. Store the frequency of elements in a HashMap.
4. If all elements are distinct, update the maximum sum.
5. Slide the window by removing the left element and adding the next element.
6. Update the maximum sum whenever the window has k distinct elements.

Time Complexity: O(n)
Space Complexity: O(k)
*/

class Solution {
    public long maximumSubarraySum(int[] nums, int k) {

        if (nums.length < k) {
            return 0;
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        int i = 0;
        int j = k - 1;
        long max = 0;
        long sum = 0;

        for (int t = i; t <= j; t++) {
            sum += nums[t];
            map.put(nums[t], map.getOrDefault(nums[t], 0) + 1);
        }

        if (map.size() == k) {
            max = Math.max(max, sum);
        }

        while (j < nums.length - 1) {
            map.put(nums[i], map.get(nums[i]) - 1);

            if (map.get(nums[i]) == 0) {
                map.remove(nums[i]);
            }

            sum -= nums[i];

            map.put(nums[j + 1], map.getOrDefault(nums[j + 1], 0) + 1);
            sum += nums[j + 1];

            i++;
            j++;

            if (map.size() == k) {
                max = Math.max(max, sum);
            }
        }

        return max;
    }
}