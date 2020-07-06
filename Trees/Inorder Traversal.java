// Given a Binary Tree, find the In-Order Traversal of it.
// Example:
// Input:
// 2
// 1 3 2
// 10 20 30 40 60 50
// Output:
// 3 1 2
// 40 20 60 10 50 30

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
  ArrayList<Integer> inorder = new ArrayList<Integer>();

  ArrayList<Integer> inOrder(Node root) {
    inOrderUtil(root);
    return inorder;
  }

  void inOrderUtil(Node root) {
    if (root == null) return;

    inOrderUtil(root.left);

    inorder.add(root.data);

    inOrderUtil(root.right);
  }
}
