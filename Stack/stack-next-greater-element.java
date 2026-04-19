/*Problem: Next Greater Element (Using Stack)
Description
Given an array of integers, the task is to find the next greater element (NGE) for every element in the array.
The Next Greater Element for an element x is the first greater element on its right side in the array.
If no such element exists, return -1 for that position.

Input
An integer array arr[] of size n
Output
An array where each element represents the next greater element of the corresponding index
Example
Input:  arr = [4, 5, 2, 10]
Output:       [5, 10, 10, -1]

Explanation:
Next greater of 4 → 5
Next greater of 5 → 10
Next greater of 2 → 10
Next greater of 10 → -1

💡 Approach (Monotonic Stack)
Traverse the array from right to left
Use a stack to store potential next greater elements
Pop elements from stack that are less than or equal to current element
The top of the stack will be the next greater element
If stack is empty → answer is -1
Push current element to stack

⏱️ Time Complexity
O(n)
Each element is pushed and popped from the stack at most once
🧠 Space Complexity
O(n)
For the stack and result array*/

import java.util.*;
public class NextGreaterElement {
    public static int[] nextGreater(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }

            result[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(arr[i]);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 10};
        int[] res = nextGreater(arr);

        System.out.println(Arrays.toString(res));
    }
}
