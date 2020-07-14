import java.util.LinkedList;
import java.util.Queue;

class Tree {

  static class TreeNode {
    int data;
    TreeNode left, right;

    TreeNode(int data) {
      this.data = data;
      this.left = null;
      this.right = null;
    }
  }

  static TreeNode root;
  static TreeNode temp = root;

  static void inorder(TreeNode node) {
    if (node == null) return;

    inorder(node.left);
    System.out.print(node.data + " ");
    inorder(node.right);
  }

  static void insert(TreeNode root, int data) {
    Queue<TreeNode> helper = new LinkedList<TreeNode>();
    helper.add(root);

    while (!helper.isEmpty()) {
      temp = helper.poll();
      if (temp.left == null) {
        temp.left = new TreeNode(data);
        break;
      } else helper.add(temp.left);

      if (temp.right == null) {
        temp.right = new TreeNode(data);
        break;
      } else helper.add(temp.right);
    }
  }

  public static void main(String args[]) {
    // Create the following Binary Tree
    //          10
    //         /  \
    //        11   9
    //       /      \
    //      7        8
    root = new TreeNode(10);
    root.left = new TreeNode(11);
    root.left.left = new TreeNode(7);
    root.right = new TreeNode(9);
    root.right.left = new TreeNode(15);
    root.right.right = new TreeNode(8);

    System.out.println("Inorder traversal before insertion: ");
    inorder(root);

    int key = 12;
    insert(root, key);

    System.out.println("\nInorder traversal after insertion: ");
    inorder(root);
  }
}
