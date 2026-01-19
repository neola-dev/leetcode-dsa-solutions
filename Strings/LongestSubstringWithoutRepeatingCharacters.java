import java.util.Arrays;

/**
 * LeetCode 3 - Longest Substring Without Repeating Characters
 *
 * Approach (Sliding Window + Last Seen Index):
 * - Use two pointers (l and r) to represent a sliding window.
 * - Maintain an array `harr` that stores the last index
 *   where each character was seen.
 * - When a repeating character is found inside the current window,
 *   move the left pointer just after the previous occurrence.
 * - Update the maximum window length during traversal.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)  (constant size array of 256 ASCII characters)
 */
class Solution {

    public int lengthOfLongestSubstring(String s) {

        int n = s.length();

        // Left and right pointers for sliding window
        int l = 0, r = 0;

        // Array to store last seen index of each character
        int[] harr = new int[256];
        Arrays.fill(harr, -1);

        int maxLen = 0;

        while (r < n) {

            // If character was seen before and is inside current window
            if (harr[s.charAt(r)] != -1 && harr[s.charAt(r)] >= l) {
                // Move left pointer just after the previous occurrence
                l = harr[s.charAt(r)] + 1;
            }

            // Update maximum length of valid window
            maxLen = Math.max(maxLen, r - l + 1);

            // Update last seen index of current character
            harr[s.charAt(r)] = r;

            r++;
        }

        return maxLen;
    }
}
