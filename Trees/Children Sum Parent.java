// Given a Binary Tree. Check whether all of its nodes have the value equal to the sum of their child nodes.
// Example:
// Input:
// 2
// 10 10
// 1 4 3 5 N
// Output:
// 1
// 0

// Iterative
class Tree {

  public static int isSumProperty(Node root) {
    Queue<Node> q = new LinkedList<Node>();

    q.add(root);

    while (!q.isEmpty()) {
      Node temp = q.poll();

      if (temp.left != null && temp.right != null) {
        if (temp.data != temp.left.data + temp.right.data) return 0;

        q.add(temp.left);
        q.add(temp.right);
      } else if (temp.left != null) {
        if (temp.data != temp.left.data) return 0;

        q.add(temp.left);
      } else if (temp.right != null) {
        if (temp.data != temp.right.data) return 0;

        q.add(temp.right);
      }
    }
    return 1;
  }
}

// Recursive
class Tree {

  public static int isSumProperty(Node node) {
    int left_data = 0, right_data = 0;

    if (
      node == null || (node.left == null && node.right == null)
    ) return 1; else {
      if (node.left != null) left_data = node.left.data;

      if (node.right != null) right_data = node.right.data;

      if (
        (node.data == left_data + right_data) &&
        (isSumProperty(node.left) != 0) &&
        isSumProperty(node.right) != 0
      ) return 1; else return 0;
    }
  }
}
