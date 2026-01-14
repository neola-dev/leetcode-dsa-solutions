// Problem: Container With Most Water
// Approach: Two Pointer Technique
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {

    // This method finds the maximum area of water
    // that can be contained between two lines
    public int maxArea(int[] height) {

        // Left pointer at the beginning
        int l = 0;

        // Right pointer at the end
        int r = height.length - 1;

        // Variable to store the maximum area found
        int maxArea = 0;

        // Use two-pointer technique
        while (l < r) {

            // Height of the container is the minimum of the two lines
            int ht = Math.min(height[l], height[r]);

            // Width of the container
            int dist = r - l;

            // Calculate current area
            int area = ht * dist;

            // Update maximum area if current area is larger
            maxArea = Math.max(maxArea, area);

            // Move the pointer pointing to the smaller height
            // because moving the taller one cannot increase the area
            if (height[l] < height[r]) {
                l++;
            } else {
                r--;
            }
        }

        // Return the maximum area
        return maxArea;
    }
}
