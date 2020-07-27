// You are given an amount denoted by value. You are also given an array of coins. The array contains the denominations
// of the give coins. You need to find the minimum number of coins to make the change for value using the coins of given
// denominations. Also, keep in mind that you have infinite supply of the coins.
// If making the change is not possible then print "Not Possible"

// Example:
// Input:
// 2
// 5
// 3
// 3 6 3
// 10
// 4
// 2 5 3 6
// Output:
// Not Possible
// 2

class Geeks {

  //Complete this function
  public long minimumNumberOfCoins(int coins[], int m, int V) {
    // table[i] will be storing
    // the minimum number of coins
    // required for i value. So
    // table[V] will have result
    long table[] = new long[V + 1];

    // Base case (If given value V is 0)
    table[0] = 0;

    // Initialize all table values as Infinite
    for (int i = 1; i <= V; i++) table[i] = Integer.MAX_VALUE;

    // Compute minimum coins required for all
    // values from 1 to V
    for (int i = 1; i <= V; i++) {
      // Go through all coins smaller than i
      for (int j = 0; j < m; j++) if (coins[j] <= i) {
        long sub_res = table[i - coins[j]];
        if (sub_res != Integer.MAX_VALUE && sub_res + 1 < table[i]) table[i] =
          sub_res + 1;
      }
    }
    if (table[V] == Integer.MAX_VALUE) return -1;

    return table[V];
  }
}
