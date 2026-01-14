// Problem: Merge Intervals
// Approach: Sort intervals and merge overlapping ranges
// Time Complexity: O(n log n)
// Space Complexity: O(n)

class Solution {

    // This method merges all overlapping intervals
    public int[][] merge(int[][] intervals) {

        // List to store merged intervals
        List<int[]> res = new ArrayList<>();

        // Sort intervals based on starting time
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        // Traverse through each interval
        for (int[] interval : intervals) {

            // If the list is empty OR current interval does not overlap
            // with the last interval in the result list
            if (res.isEmpty() || interval[0] > res.get(res.size() - 1)[1]) {

                // Add the interval to the result list
                res.add(interval);
            } 
            else {
                // Merge the current interval with the last one
                res.get(res.size() - 1)[1] =
                        Math.max(res.get(res.size() - 1)[1], interval[1]);
            }
        }

        // Convert the list to a 2D array and return
        return res.toArray(new int[res.size()][]);
    }
}
