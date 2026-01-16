/**
 * Checks if a given string is a valid palindrome, considering only alphanumeric characters 
 * and ignoring cases.
 *
 * Approach:
 * - Use two pointers: one at the start (l) and one at the end (r) of the string.
 * - Move the pointers inward while skipping any characters that are not letters or digits.
 * - Compare the lowercase version of the characters at the two pointers.
 * - If at any point the characters don't match, return false.
 * - If all valid characters match, return true.
 *
 * Example:
 * Input:  "A man, a plan, a canal: Panama"
 * Output: true
 *
 * Input:  "race a car"
 * Output: false
 *
 * Time Complexity: O(n), where n is the length of the string (each character is visited at most once).
 * Space Complexity: O(1), as no extra space is used apart from pointers and temporary variables.
 *
 * @param s The input string to be checked.
 * @return true if the string is a palindrome ignoring non-alphanumeric characters and case, otherwise false.
 */
public boolean isPalindrome(String s) {
    int l = 0;
    int r = s.length() - 1;
    while (l <= r) {
        char chLeft = s.charAt(l);
        char chRight = s.charAt(r);

        if (Character.isWhitespace(chLeft) || !Character.isLetterOrDigit(chLeft)) {
            l++;
        } else if (Character.isWhitespace(chRight) || !Character.isLetterOrDigit(chRight)) {
            r--;
        } else if (Character.toLowerCase(chLeft) != Character.toLowerCase(chRight)) {
            return false;
        } else {
            l++;
            r--;
        }
    }
    return true;
}
