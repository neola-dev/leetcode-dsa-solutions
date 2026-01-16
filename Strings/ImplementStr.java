// Problem: Implement strStr()
// Approach: Use built-in String methods
// Time Complexity: O(n * m) (depends on internal implementation)
// Space Complexity: O(1)

class Solution {

    // This method returns the index of the first occurrence
    // of the substring 'needle' in the string 'haystack'
    public int strStr(String haystack, String needle) {

        // Check if haystack contains needle
        if (haystack.contains(needle)) {

            // Return the starting index of needle
            return haystack.indexOf(needle);
        }

        // If needle is not found, return -1
        return -1;
    }
}
