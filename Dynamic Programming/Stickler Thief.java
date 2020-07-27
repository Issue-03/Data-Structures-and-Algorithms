// Stickler the thief wants to loot money from a society having n houses in a single line. He is a weird person and
// follows a certain rule when looting the houses. According to the rule, he will never loot two consecutive houses.
// At the same time, he wants to maximize the amount he loots. The thief knows which house has what amount of money
// but is unable to come up with an optimal looting strategy. He asks for your help to find the maximum money he can
// get if he strictly follows the rule. Each house has a[i] amount of money present in it.

// Example:
// Input:
// 2
// 6
// 5 5 10 100 10 5
// 3
// 1 2 3
// Output:
// 110
// 4

class solve {

  // Function to return maximum of sum without adjacent elements
  public int FindMaxSum(int arr[], int n) {
    // Your code here
    if (n == 0) return 0;

    int value1 = arr[0];
    if (n == 1) return value1;

    int value2 = Math.max(arr[0], arr[1]);
    if (n == 2) return value2;

    // contains maximum stolen value at the end
    int max_val = 0;

    // Fill remaining positions
    for (int i = 2; i < n; i++) {
      max_val = Math.max(arr[i] + value1, value2);
      value1 = value2;
      value2 = max_val;
    }

    return max_val;
  }
}
