// Suppose you have N eggs and you want to determine from which floor in a K-floor building you can drop an egg such
// that it doesn't break. You have to determine the minimum number of attempts you need in order find the critical
// floor in the worst case while using the best strategy.There are few rules given below.

// An egg that survives a fall can be used again.
// A broken egg must be discarded.
// The effect of a fall is the same for all eggs.
// If the egg doesn't break at a certain floor, it will not break at any floor below.
// If the eggs breaks at a certain floor, it will break at any floor above.

// Example:
// Input:
// 2
// 2 10
// 3 5
// Output:
// 4
// 3

class EggDrop {

  static int binomialCoeff(int x, int n, int k) {
    int sum = 0, term = 1;
    for (int i = 1; i <= n && sum < k; ++i) {
      term *= x - i + 1;
      term /= i;
      sum += term;
    }
    return sum;
  }

  static int eggDrop(int n, int k) {
    // Your code here
    int low = 1, high = k;

    // Do binary search, for every mid,
    // find sum of binomial coefficients and
    // check if the sum is greater than k or not.
    while (low < high) {
      int mid = (low + high) / 2;
      if (binomialCoeff(mid, n, k) < k) low = mid + 1; else high = mid;
    }

    return low;
  }
}
