class Solution {

  public int minValue(Node root) {
    int min = root.key;
    while (root.left != null) {
      min = root.left.key;
      root = root.left;
    }
    return root;
  }

  public Node delete(Node root, int key) {
    if (root == null) return root;

    if (key < root.key) root.left = delete(root.left, key); else if (
      key > root.key
    ) root.right = delete(root.right, key); else {
      if (root.left == null) return root.right; else if (
        root.right == null
      ) return root.left;

      root.key = minValue(root.right);

      root.right = delete(root.right, root.key);
    }

    return root;
  }
}
