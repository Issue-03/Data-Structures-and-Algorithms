// You have an infinite supply of coins, each having some value. Find out the number of ways to use the coins to sum-up
// to a certain required value.
//
// Example:
// Input:
// 2
// 4
// 3
// 1 2 3
// 10
// 4
// 2 5 3 6
// Output:
// 4
// 5

class Geeks {

  //Complete this function
  public long numberOfWays(int coins[], int numberOfCoins, int value) {
    long ways[] = new long[value + 1];
    ///We declare an array that will contain the number of--
    //ways to make change for all values from 0 to value
    //This is done as we are working from bottom up. So, obviously, we need to make change for smaller values--
    //before we can make change for the given values.

    ways[0] = 1; //We can make change for 0 in 1 ways, that is by choosing nothing.

    for (int coin : coins) { //Using a coin, one at a time
      for (int i = coin; i < value + 1; i++) {
        ways[i] += ways[i - coin];
      }
    }
    return ways[value];
  }
}
