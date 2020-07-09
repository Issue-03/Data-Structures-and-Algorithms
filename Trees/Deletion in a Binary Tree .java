// Given a Binary Tree of size N, your task is to complete the function deletionBT(),
// that should delete a given node from the tree by making sure that tree shrinks from the
// bottom (the deleted node is replaced by bottommost and rightmost node).
// Example:
// Input:
// 2
// 1
// 1 4 7 5 6
// 5
// 7 10 4 11 2 5 9
// Output:
// 5 4 6 7
// 11 10 2 7 9 4

/*
Node class is as follows:

class Node {
    int data;
    Node left, right;
    
    public Node(int data){
        this.data = data;
    }
}
*/

class Solution {

  public void deleteDeepest(Node root, Node d_node) {
    Queue<Node> q = new LinkedList<Node>();
    q.add(root);

    // Do level order traversal until last node
    Node temp;
    while (!q.isEmpty()) {
      temp = q.poll();
      if (temp == d_node) {
        temp = null;
        return;
      }
      if (temp.right != null) {
        if (temp.right == d_node) {
          temp.right = null;
          return;
        } else q.add(temp.right);
      }

      if (temp.left != null) {
        if (temp.left == d_node) {
          temp.left = null;
          return;
        } else q.add(temp.left);
      }
    }
  }

  public Node deletionBT(Node root, int key) {
    if (root == null) return null;

    if (root.left == null && root.right == null) {
      if (root.data == key) return null; else return root;
    }

    Queue<Node> q = new LinkedList<Node>();
    q.add(root);
    Node temp = null;
    Node key_node = null;
    while (!q.isEmpty()) {
      temp = q.poll();

      if (temp.data == key) key_node = temp;

      if (temp.left != null) q.add(temp.left);

      if (temp.right != null) q.add(temp.right);
    }

    if (key_node != null) {
      int x = temp.data;
      deleteDeepest(root, temp);
      key_node.data = x;
    }
    return root;
  }
}
