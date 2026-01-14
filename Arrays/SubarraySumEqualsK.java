// Problem: Subarray Sum Equals K
// Approach: Prefix Sum + HashMap
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution {

    // This method returns the count of continuous subarrays
    // whose sum is equal to k
    public int subarraySum(int[] nums, int k) {

        // HashMap to store prefix sum and its frequency
        HashMap<Integer, Integer> hmap = new HashMap<>();

        // Base case: prefix sum 0 occurs once
        hmap.put(0, 1);

        int sum = 0;   // Running prefix sum
        int cnt = 0;   // Count of subarrays with sum k

        // Traverse through the array
        for (int i = 0; i < nums.length; i++) {

            // Add current element to prefix sum
            sum += nums[i];

            // Calculate the remaining sum needed
            int rem = sum - k;

            // If rem exists, add its frequency to the count
            cnt += hmap.getOrDefault(rem, 0);

            // Store/update the current prefix sum in the map
            hmap.put(sum, hmap.getOrDefault(sum, 0) + 1);
        }

        // Return the total count of valid subarrays
        return cnt;
    }
}
