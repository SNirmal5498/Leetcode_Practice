/*
Approach:
1. Sort both input arrays.
2. Use two pointers:
   - i for nums1
   - j for nums2
3. Compare elements at both pointers:
   - If nums1[i] < nums2[j], move i forward.
   - If nums1[i] > nums2[j], move j forward.
   - If both elements are equal:
     - Add the element to the result only if it is not already present.
     - Move both pointers forward.
4. Store common unique elements in a temporary array.
5. Return the final result using Arrays.copyOf().

Time Complexity: O(n log n + m log m)
Space Complexity: O(min(n, m))
*/

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i = 0;
        int j = 0;
        int[] temp = new int[Math.min(nums1.length, nums2.length)];
        int k = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                if (k == 0 || temp[k - 1] != nums1[i]) {
                    temp[k] = nums1[i];
                    k++;
                }
                i++;
                j++;
            }
        }

        return Arrays.copyOf(temp, k);
    }
}