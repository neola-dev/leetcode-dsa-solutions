// Problem: Remove Duplicates from Sorted Array
// Approach: Two-pointer technique
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {

    // This method removes duplicates from a sorted array in-place
    // and returns the number of unique elements
    public int removeDuplicates(int[] nums) {

        // Pointer i keeps track of the position of the last unique element
        int i = 0;

        // Pointer j traverses the array from the second element
        for (int j = 1; j < nums.length; j++) {

            // If a new unique element is found
            if (nums[j] != nums[i]) {

                // Place the unique element at the next position
                nums[i + 1] = nums[j];

                // Move the unique pointer forward
                i++;
            }
        }

        // Return the count of unique elements
        return i + 1;
    }
}
