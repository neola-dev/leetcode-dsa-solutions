// Problem: 3Sum
// Approach: Sorting + Two Pointers
// Time Complexity: O(n^2)
// Space Complexity: O(1) (excluding output list)

class Solution {

    // This method returns all unique triplets in the array
    // whose sum is equal to zero
    public List<List<Integer>> threeSum(int[] nums) {

        // Sort the array to apply two-pointer technique
        Arrays.sort(nums);

        // List to store the result triplets
        List<List<Integer>> res = new ArrayList<>();

        // Traverse the array
        for (int i = 0; i < nums.length; i++) {

            // Skip duplicate elements for the first pointer
            if (i != 0 && nums[i] == nums[i - 1])
                continue;

            // Initialize two pointers
            int j = i + 1;
            int k = nums.length - 1;

            // Two-pointer approach to find remaining two numbers
            while (j < k) {

                int ans = nums[i] + nums[j] + nums[k];

                // If sum is less than zero, move left pointer to the right
                if (ans < 0) {
                    j++;
                }
                // If sum is greater than zero, move right pointer to the left
                else if (ans > 0) {
                    k--;
                }
                // If sum equals zero, a valid triplet is found
                else {

                    // Add the triplet to the result list
                    List<Integer> sub = Arrays.asList(nums[i], nums[j], nums[k]);
                    res.add(sub);

                    // Move both pointers after finding a valid triplet
                    j++;
                    k--;

                    // Skip duplicate values for j
                    while (j < k && nums[j] == nums[j - 1]) {
                        j++;
                    }

                    // Skip duplicate values for k
                    while (j < k && nums[k] == nums[k + 1]) {
                        k--;
                    }
                }
            }
        }

        // Return all unique triplets
        return res;
    }
}
