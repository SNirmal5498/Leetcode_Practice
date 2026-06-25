/*
Approach:
1. If s1 is longer than s2, return false.
2. Store the frequency of characters in s1.
3. Create the first window of size s1.length() in s2.
4. Compare both frequency maps.
5. Slide the window by removing the left character and adding the next character.
6. If both maps are equal, return true.
7. If no matching window is found, return false.

Time Complexity: O(n)
Space Complexity: O(k)
*/

class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length()) {
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> map1 = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int i = 0;
        int j = s1.length() - 1;

        for (int k = i; k <= j; k++) {
            char ch = s2.charAt(k);
            map1.put(ch, map1.getOrDefault(ch, 0) + 1);
        }

        if (map.equals(map1)) {
            return true;
        }

        while (j < s2.length() - 1) {
            char ch = s2.charAt(i);
            map1.put(ch, map1.get(ch) - 1);

            if (map1.get(ch) == 0) {
                map1.remove(ch);
            }

            char ch1 = s2.charAt(j + 1);
            map1.put(ch1, map1.getOrDefault(ch1, 0) + 1);

            i++;
            j++;

            if (map.equals(map1)) {
                return true;
            }
        }

        return false;
    }
}