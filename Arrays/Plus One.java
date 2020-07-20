// Given a non-empty array of digits representing a non-negative integer, increment one to the integer.

// The digits are stored such that the most significant digit is at the head of the list, and each element in the
// array contains a single digit.

// You may assume the integer does not contain any leading zero, except the number 0 itself.

// Example 1:

// Input: [1,2,3]
// Output: [1,2,4]
// Explanation: The array represents the integer 123.
// Example 2:

// Input: [4,3,2,1]
// Output: [4,3,2,2]
// Explanation: The array represents the integer 4321.

class Solution {

  public int[] plusOne(int[] digits) {
    int[] result;
    // Reverse Traversal
    for (int i = digits.length - 1; i >= 0; i--) {
      if (digits[i] < 9) {
        digits[i] = digits[i] + 1;
        break;
      } else {
        digits[i] = 0;
        // if all are 9
        if (i == 0) {
          result = new int[digits.length + 1];
          int j = 1;
          result[0] = 1;
          while (j <= digits.length) {
            result[j] = digits[j - 1];
            j++;
          }
          return result;
        }
      }
    }
    return digits;
  }
}
