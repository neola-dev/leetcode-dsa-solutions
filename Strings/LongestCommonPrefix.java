class Solution {
    public String longestCommonPrefix(String[] strs) {
        // Initialize prefix as the first string
        String pre = strs[0];

        // Compare prefix with each string one by one
        for (int i = 1; i < strs.length; i++) {
            String word = strs[i];

            // Find the minimum length to avoid index out of bounds
            int n = Math.min(word.length(), pre.length());
            int j = 0;

            // Compare characters until mismatch
            while (j < n && pre.charAt(j) == word.charAt(j)) {
                j++;
            }

            // Update prefix to the common part
            pre = pre.substring(0, j);

            // If at any point prefix becomes empty, no common prefix exists
            if (pre.isEmpty()) return "";
        }

        // Final longest common prefix
        return pre;
    }
}
