/*
 Problem: Group Anagrams (LeetCode 49)

 Approach:
 - For each word, build a frequency count of characters (a–z).
 - Convert the frequency array into a unique string key.
 - Words with the same key are anagrams and are grouped together.

 Why frequency-based key?
 - Avoids sorting each string.
 - More efficient and guarantees uniqueness for anagrams.

 Time Complexity:
 - Let n be the number of strings.
 - Let k be the maximum length of a string.
 - Building frequency array for each string takes O(k).
 - Total Time Complexity: O(n * k)

 Space Complexity:
 - HashMap stores up to n keys and all characters.
 - Frequency array of size 26 is reused for each string.
 - Total Space Complexity: O(n * k)

 Edge Cases Handled:
 - Empty input array.
 - Strings with same characters in different orders.

 Constraints Assumed:
 - All characters are lowercase English letters (a–z).
 */
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        // Edge case: if input array is empty, return empty list
        if (strs.length == 0) {
            return new ArrayList<>();
        }

        // Map to store anagram groups
        // Key   -> frequency-based string representation
        // Value -> list of words matching that frequency
        HashMap<String, List<String>> map = new HashMap<>();

        // Process each word in the input array
        for (String word : strs) {

            // Frequency array for characters 'a' to 'z'
            int[] count = new int[26];

            // Count character frequencies for the current word
            for (int i = 0; i < word.length(); i++) {
                count[word.charAt(i) - 'a']++;
            }

            // Convert frequency array into a unique string key
            // Example: "#1#0#0#2..."
            StringBuilder key = new StringBuilder();
            for (int i = 0; i < 26; i++) {
                key.append('#').append(count[i]);
            }

            String k = key.toString();

            // Add word to the corresponding anagram group
            if (map.containsKey(k)) {
                map.get(k).add(word);
            } else {
                map.put(k, new ArrayList<>());
                map.get(k).add(word);
            }
        }

        // Convert map values to final result list
        List<List<String>> result = new ArrayList<>();
        for (List<String> group : map.values()) {
            result.add(group);
        }

        return result;
    }
}
