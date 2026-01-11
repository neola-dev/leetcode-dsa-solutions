// Problem: Two Sum
// LeetCode Link: https://leetcode.com/problems/two-sum/
// Approach: Use HashMap to store numbers and their indices
// This allows checking complement in O(1) time
// Time Complexity: O(n) — single pass through array
// Space Complexity: O(n) — HashMap stores at most n elements

import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // HashMap to store number -> index
        HashMap<Integer, Integer> hmap = new HashMap<>();
        
        // Result array to store the two indices
        int[] res = new int[2];
        
        // Variable to store current number in iteration
        int presum = 0;
        
        for (int i = 0; i < nums.length; i++) {
            presum = nums[i];                  // Current number
            int rem = target - presum;         // Complement to reach target
            
            // Check if complement already exists in HashMap
            if (hmap.containsKey(rem)) {
                res[0] = hmap.get(rem);        // Index of complement
                res[1] = i;                    // Current index
            }
            
            // Only put current number if it's not already in map
            if (!hmap.containsKey(presum)) {
                hmap.put(presum, i);           // Store number and index
            }
        }
        
        return res;                            // Return indices of the two numbers
    }
}
