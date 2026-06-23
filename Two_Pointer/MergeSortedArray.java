/*
Approach:
1. Initialize three pointers:
   - i = last element of nums1
   - j = last element of nums2
   - k = last position of nums1
2. Compare nums1[i] and nums2[j].
3. Place the larger element at nums1[k].
4. Move the corresponding pointer.
5. If elements remain in nums2, copy them to nums1.
6. nums1 now contains the merged sorted array.

Time Complexity: O(m + n)
Space Complexity: O(1)
*/

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }
}