// Given a string S of '(' and ')' parentheses, we add the minimum number of parentheses ( '(' or ')',
// and in any positions ) so that the resulting parentheses string is valid.

// Formally, a parentheses string is valid if and only if:

// It is the empty string, or
// It can be written as AB (A concatenated with B), where A and B are valid strings, or
// It can be written as (A), where A is a valid string.
// Given a parentheses string, return the minimum number of parentheses we must add to make the resulting string valid.

// Example:

// Input: "()))(("
// Output: 4

class Solution {

  public int minAddToMakeValid(String S) {
    if (S == "") return 0;
    Stack<Character> st = new Stack<Character>();
    for (int i = 0; i < S.length(); i++) {
      if (st.isEmpty()) {
        st.push(S.charAt(i));
      } else if (st.peek() == '(' && S.charAt(i) == ')') {
        st.pop();
      } else {
        st.push(S.charAt(i));
      }
    }
    return st.size();
  }
}
