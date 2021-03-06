// The Hamming distance between two integers is the number of positions at which the corresponding bits are different.

// Given two integers x and y, calculate the Hamming distance.

// Note:
// 0 ≤ x, y < 231.

// Example:

// Input: x = 1, y = 4

// Output: 2

// Explanation:
// 1   (0 0 0 1)
// 4   (0 1 0 0)
//        ↑   ↑

// The above arrows point to positions where the corresponding bits are different.

class Solution {

  public int hammingDistance(int x, int y) {
    int temp = x ^ y, z, count = 0;
    while (temp > 0) {
      if ((z = temp & 1) == 1) count++;
      temp = temp >>> 1;
    }
    return count;
  }
}

class Solution {
    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x^y);
    }
}
