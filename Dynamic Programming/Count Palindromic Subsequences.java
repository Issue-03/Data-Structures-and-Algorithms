// Given a string str, your task is to complete the function countPs which takes a string str as its only argument and
// returns an integer denoting the no of palindromic subsequence (need not necessarily be distinct) which could be formed
// from the string str.

class Solution {

  static int CountPS(String str) {
    int N = str.length();

    int[][] cps = new int[N + 1][N + 1];

    for (int i = 0; i < N; i++) cps[i][i] = 1;

    for (int L = 2; L <= N; L++) {
      for (int i = 0; i < N; i++) {
        int j = i + L - 1;
        if (j < N) {
          if (str.charAt(i) == str.charAt(j)) cps[i][j] =
            cps[i + 1][j] + cps[i][j - 1] + 1; else cps[i][j] =
            cps[i + 1][j] + cps[i][j - 1] - cps[i + 1][j - 1];
        }
      }
    }
    return cps[0][N - 1];
  }
}

// Java program to counts Palindromic Subsequence
// in a given String using recursion

class GFG {
  static int n;
  static int[][] dp = new int[1000][1000];

  static String str = "abcb";

  // Function return the total
  // palindromic subsequence
  static int countPS(int i, int j) {
    if (i >= n || j < 0) return 0;

    if (dp[i][j] != -1) return dp[i][j];

    // base cases
    if ((i - j == 1) || (i - j == -1)) {
      // eg-> aaa
      if (str.charAt(i) == str.charAt(j)) return dp[i][j] = 3; else return ( // eg-> ab
        dp[i][j] = 2
      );
    }

    if (i == j) return dp[1][j] = 1; else if (
      str.charAt(i) == str.charAt(j)
    ) return dp[i][j] = countPS(i + 1, j) + countPS(i, j - 1) + 1; else return (
      dp[i][j] = countPS(i + 1, j) + countPS(i, j - 1) - countPS(i + 1, j - 1)
    );
  }

  public static void main(String[] args) {
    for (int i = 0; i < 1000; i++) for (int j = 0; j < 1000; j++) dp[i][j] = -1;

    n = str.length();
    System.out.println(
      "Total palindromic subsequence" + "are : " + countPS(0, n - 1)
    );
  }
}
