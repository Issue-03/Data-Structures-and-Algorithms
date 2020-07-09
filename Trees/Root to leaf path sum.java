// Given a Binary Tree and a sum s, your task is to check whether there is a root to leaf path in that tree
// with the following sum . You are required to complete the function hasPathSum.
// You should not read any input from stdin/console. There are multiple test cases.
// For each test case, this method will be called individually.

// Example:

// Input
// 2
// 1 2 3
// 2
// 1 2 3
// 4

// Output
// 0
// 1

/*
// A Binary Tree node
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/

class Tree {

  boolean hasPathSum(Node node, int sum) {
    if (node == null) return sum == 0;

    return (
      hasPathSum(node.left, sum - node.data) ||
      hasPathSum(node.right, sum - node.data)
    );
  }
}
