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

import java.util.*;
import java.lang.*;
import java.io.*;

class ReverseWords {
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    int T = in.nextInt();
    for(int t = 0 ; t < T ; t++) {
      String input = in.next();
      String splited[] = input.split("\\.");
      String answer = "";

      for(int i = splited.length ; i >= 0 ; i--) {
        answer +=  splited[i] + ".";
      }
      System.out.println(answer.substring(0,answer.length()-1));
    }
  }
}
