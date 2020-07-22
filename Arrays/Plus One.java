// Given a non-empty array of digits representing a non-negative integer, increment one to the integer.

// The digits are stored such that the most significant digit is at the head of the list, and each element in the array
// contains a single digit.

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

  public int[] plusOne(int[] x) {
    int[] extraArr;
    for (int i = x.length - 1; i >= 0; i--) {
      if (x[i] < 9) {
        x[i] = x[i] + 1;
        break;
      } else {
        x[i] = 0;
        if (i == 0) {
          extraArr = new int[x.length + 1];
          int j = 1;
          extraArr[0] = 1;
          while (j <= x.length) {
            extraArr[j] = x[j - 1];
            j++;
          }
          return extraArr;
        }
      }
    }
    return x;
  }
}
