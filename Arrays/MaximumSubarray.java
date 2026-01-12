// Problem: Maximum Subarray
// Algorithm: Kadane’s Algorithm
// Time Complexity: O(n)
// Space Complexity: O(1)
class Solution {

    // This method finds the maximum sum of a contiguous subarray
    // using Kadane's Algorithm
    public int maxSubArray(int[] nums) {

        // Variable to store the current subarray sum
        int sum = 0;

        // Variable to store the maximum subarray sum found so far
        int max = Integer.MIN_VALUE;

        int n = nums.length;

        // Traverse through the array
        for (int i = 0; i < n; i++) {

            // Add current element to the running sum
            sum += nums[i];

            // Update maximum if current sum is greater
            if (sum > max) {
                max = sum;
            }

            // If running sum becomes negative, reset it to 0
            // because a negative sum will reduce future subarray sums
            if (sum < 0) {
                sum = 0;
            }
        }

        // Return the maximum subarray sum
        return max;
    }
}
