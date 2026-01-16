/**
 * Reverses a character array in-place.
 *
 * This method uses a two-pointer approach:
 * - One pointer starts at the beginning of the array (l) and the other at the end (r).
 * - Swap the characters at the two pointers.
 * - Move the left pointer forward (l++) and the right pointer backward (r--).
 * - Repeat the process until the pointers meet or cross each other.
 *
 * Example:
 * Input:  ['h','e','l','l','o']
 * Output: ['o','l','l','e','h']
 *
 * Time Complexity: O(n), where n is the length of the array. Each element is swapped exactly once.
 * Space Complexity: O(1), as the reversal is done in-place without using extra space.
 *
 * @param s The character array to be reversed.
 */
public void reverseString(char[] s) {
    int l = 0;
    int r = s.length - 1;
    while (l <= r) {
        char temp = s[l];
        s[l] = s[r];
        s[r] = temp;
        l++;
        r--;
    }
}
