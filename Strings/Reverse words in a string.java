// Given a String of length S, reverse the whole string without reversing the individual words in it. Words are separated by dots.
// Example:
// Input:
// 2
// i.like.this.program.very.much
// pqr.mno
//
// Output:
// much.very.program.this.like.i
// mno.pqr

import java.io.*;
import java.lang.*;
import java.util.*;

class ReverseWords {

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    int T = in.nextInt();
    for (int t = 0; t < T; t++) {
      String input = in.next();
      String splited[] = input.split("\\.");
      String answer = "";

      for (int i = splited.length - 1; i >= 0; i--) {
        answer += splited[i] + ".";
      }
      System.out.println(answer.substring(0, answer.length() - 1));
    }
  }
}

/****************************************************************************************************************/
// Example 1:

// Input: "the sky is blue"
// Output: "blue is sky the"
// Example 2:

// Input: "  hello world!  "
// Output: "world! hello"
// Explanation: Your reversed string should not contain leading or trailing spaces.
// Example 3:

// Input: "a good   example"
// Output: "example good a"
// Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string
public class Solution {

  public String reverseWords(String s) {
    if (s == null) return null;

    char[] a = s.toCharArray();
    int n = a.length;

    // step 1. reverse the whole string
    reverse(a, 0, n - 1);
    // step 2. reverse each word
    reverseWords(a, n);
    // step 3. clean up spaces
    return cleanSpaces(a, n);
  }

  void reverseWords(char[] a, int n) {
    int i = 0, j = 0;

    while (i < n) {
      while (i < j || i < n && a[i] == ' ') i++; // skip spaces
      while (j < i || j < n && a[j] != ' ') j++; // skip non spaces
      reverse(a, i, j - 1); // reverse the word
    }
  }

  // trim leading, trailing and multiple spaces
  String cleanSpaces(char[] a, int n) {
    int i = 0, j = 0;

    while (j < n) {
      while (j < n && a[j] == ' ') j++; // skip spaces
      while (j < n && a[j] != ' ') a[i++] = a[j++]; // keep non spaces
      while (j < n && a[j] == ' ') j++; // skip spaces
      if (j < n) a[i++] = ' '; // keep only one space
    }

    return new String(a).substring(0, i);
  }

  // reverse a[] from a[i] to a[j]
  private void reverse(char[] a, int i, int j) {
    while (i < j) {
      char t = a[i];
      a[i++] = a[j];
      a[j--] = t;
    }
  }
}
