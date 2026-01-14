// Problem: Rotate Array
// Approach: Reversal Algorithm
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {

    // This method rotates the array to the right by k steps
    public void rotate(int[] nums, int k) {

        int n = nums.length;

        // Handle cases where k is greater than array length
        k = k % n;

        // Step 1: Reverse the entire array
        reverse(nums, 0, n - 1);

        // Step 2: Reverse the first k elements
        reverse(nums, 0, k - 1);

        // Step 3: Reverse the remaining elements
        reverse(nums, k, n - 1);
    }

    // Helper method to reverse elements between two indices
    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
