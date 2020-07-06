// Given a binary tree, find the Postorder Traversal of it.
// Example:
// Input:
// 2
// 19 10 8 11 13
// 11 15 N 7
// Output:
// 11 13 10 8 19
// 7 15 11

/* A Binary Tree node
class Node {
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
} */

class Tree {
  ArrayList<Integer> postorder = new ArrayList<Integer>();

  ArrayList<Integer> postOrder(Node root) {
    postorderUtil(root);
    return postorder;
  }

  void postorderUtil(Node root) {
    if (root == null) return;

    postorderUtil(root.left);
    postorderUtil(root.right);
    postorder.add(root.data);
  }
}
