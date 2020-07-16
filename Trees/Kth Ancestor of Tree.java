// Given a binary tree of size  N, a node and a positive integer K., your task is to complete the function kthAncestor(),
// the function should return the Kth ancestor of the given node in the binary tree. If there does not exist any such
// ancestor then return -1.

// Example:
// Input:
// 2
// 1 3
// 1 2 3
// 2 4
// 1 2 3 4 5
// Output:
// 1
// 1

/*
Structure of Node class is:

class Node {
    int data;
    Node left, right;
    
    public Node(int data){
        this.data = data;
    }
}
*/

class Tree {
  int answer = -1;
  int K;

  public Node kthAncestorUtil(Node root, int node) {
    if (root == null) return null;

    if (
      root.data == node ||
      kthAncestorUtil(root.left, node) != null ||
      kthAncestorUtil(root.right, node) != null
    ) {
      if (K > 0) K--; else if (K == 0) {
        this.answer = root.data;
        return null;
      }
      return root;
    }
    return null;
  }

  public int kthAncestor(Node root, int k, int node) {
    //Write your code here
    K = k;
    kthAncestorUtil(root, node);
    return this.answer;
  }
}
