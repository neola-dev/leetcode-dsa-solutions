// Problem: Move Zeroes
// Approach: Two-pointer swap method
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {

    // This method moves all zeroes to the end of the array
    // while maintaining the relative order of non-zero elements
    public void moveZeroes(int[] nums) {

        // Variable to store the index of the first zero
        int j = -1;

        // Find the index of the first zero in the array
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                j = i;
                break;
            }
        }

        // If no zero is found, the array is already in the required form
        if (j == -1)
            return;

        // Traverse the array from the element after the first zero
        for (int i = j + 1; i < nums.length; i++) {

            // If a non-zero element is found, swap it with the zero at index j
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

                // Move j to the next position to track the next zero
                j++;
            }
        }
    }
}
