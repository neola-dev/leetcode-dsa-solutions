/**
 * LeetCode 242 - Valid Anagram
 *
 * Approach:
 * - Use a frequency array of size 26 (for lowercase English letters).
 * - Increment count for characters in string `s`.
 * - Decrement count for characters in string `t`.
 * - If both strings are anagrams, all values in the frequency array
 *   should be zero at the end.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)  (constant size array of 26)
 */
class Solution {

    public boolean isAnagram(String s, String t) {

        // If lengths differ, they cannot be anagrams
        if (s.length() != t.length()) {
            return false;
        }

        // Frequency array for characters 'a' to 'z'
        int[] arr = new int[26];

        // Update frequency counts
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++; // count character from s
            arr[t.charAt(i) - 'a']--; // remove character from t
        }

        // Check if all frequencies are zero
        for (int i = 0; i < 26; i++) {
            if (arr[i] != 0) {
                return false; // mismatch found
            }
        }

        return true; // all counts balanced → valid anagram
    }
}
