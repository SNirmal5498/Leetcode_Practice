/*
Approach:
1. If s is shorter than p, return an empty list.
2. Store the frequency of characters in p.
3. Create the first window of size p.length().
4. Compare both frequency maps.
5. Slide the window by removing the left character and adding the next character.
6. If both maps are equal, add the starting index to the answer.
7. Return the list of indices.

Time Complexity: O(n)
Space Complexity: O(k)
*/

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        if (s.length() < p.length()) {
            return Collections.emptyList();
        }

        Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> map1 = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for (char ch : p.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int i = 0;
        int j = p.length() - 1;

        for (int k = i; k <= j; k++) {
            char ch = s.charAt(k);
            map1.put(ch, map1.getOrDefault(ch, 0) + 1);
        }

        if (map.equals(map1)) {
            list.add(i);
        }

        while (j < s.length() - 1) {
            char ch = s.charAt(i);
            map1.put(ch, map1.get(ch) - 1);

            if (map1.get(ch) == 0) {
                map1.remove(ch);
            }

            char ch1 = s.charAt(j + 1);
            map1.put(ch1, map1.getOrDefault(ch1, 0) + 1);

            i++;
            j++;

            if (map.equals(map1)) {
                list.add(i);
            }
        }

        return list;
    }
}