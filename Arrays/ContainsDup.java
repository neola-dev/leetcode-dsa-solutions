class Solution {

    // This method checks whether the array contains any duplicate elements
    public boolean containsDuplicate(int[] nums) {

        // Sort the array so that duplicate elements come next to each other
        Arrays.sort(nums);

        // Traverse the sorted array and compare adjacent elements
        for (int i = 1; i < nums.length; i++) {

            // If two consecutive elements are the same, a duplicate exists
            if (nums[i] == nums[i - 1])
                return true;
        }

        // If no duplicates are found, return false
        return false;
    }
}
