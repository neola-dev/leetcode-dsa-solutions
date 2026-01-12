// Problem: Product of Array Except Self
// Approach: Prefix and Suffix Product
// Time Complexity: O(n)
// Space Complexity: O(1) (excluding output array)
class Solution {

    // This method returns an array where each element is the product
    // of all elements except the one at the current index
    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;

        // Result array to store the final product values
        int[] arr = new int[n];

        // Variable to store suffix product (product of elements to the right)
        int suffix = 1;

        // First pass: calculate suffix products
        for (int i = n - 1; i >= 0; i--) {
            arr[i] = suffix;
            suffix = suffix * nums[i];
        }

        // Variable to store prefix product (product of elements to the left)
        int prefix = 1;

        // Second pass: multiply prefix products with existing suffix products
        for (int i = 0; i < n; i++) {
            arr[i] = prefix * arr[i];
            prefix = prefix * nums[i];
        }

        // Return the result array
        return arr;
    }
}
