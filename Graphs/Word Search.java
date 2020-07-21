// Given a 2D board and a word, find if the word exists in the grid.

// The word can be constructed from letters of sequentially adjacent cell, where "adjacent" cells are those
// horizontally or vertically neighboring. The same letter cell may not be used more than once.

// Example:

// board =
// [
//   ['A','B','C','E'],
//   ['S','F','C','S'],
//   ['A','D','E','E']
// ]

// Given word = "ABCCED", return true.
// Given word = "SEE", return true.
// Given word = "ABCB", return false.

class Solution {
  char[][] board;
  int row, col, wordSize;
  char[] wordArray;

  public boolean exist(char[][] board, String word) {
    this.board = board;
    wordSize = word.length();

    row = board.length;
    col = board[0].length;

    int i = 0;
    int j = 0;
    this.wordArray = word.toCharArray();
    boolean retVal = false;

    while (i < row & !retVal) {
      j = 0;
      while (j < col & !retVal) {
        if (board[i][j] == wordArray[0] && findWord(i, j, 0)) {
          retVal = true;
          break;
        }
        j++;
      }
      i++;
    }

    return retVal;
  }

  private boolean findWord(int start, int end, int index) {
    if (
      ((start > row - 1 || end > col - 1) || (start < 0 || end < 0)) &&
      index < wordSize
    ) {
      return false;
    }

    if (index == wordSize) {
      return true;
    }

    char foundChar = board[start][end];
    char targetChar = wordArray[index];

    if (foundChar != targetChar) {
      return false;
    }

    board[start][end] = 1;

    if (
      !(
        findWord(start, end + 1, index + 1) ||
        findWord(start + 1, end, index + 1) ||
        findWord(start - 1, end, index + 1) ||
        findWord(start, end - 1, index + 1)
      )
    ) {
      board[start][end] = foundChar;
      return false;
    }
    return true;
  }
}
