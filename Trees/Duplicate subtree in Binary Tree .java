// Given a Binary Tree, the task is to complete the function dupSub which takes the root of the tree as the only argument 
// and returns true if the Binary tree contains a duplicate sub-tree of size two or more
// Example:
// 2
// (a(b(d()())(e()()))(c()(b(d()())(e()()))))
// (a(b()())(c()()))

// Output:
// 1
// 0
class GfG {
  static final char MARKER = '$';
  static Set<String> subtrees = new HashSet<String>();

  public static boolean dupSub(Node root) {
    subtrees.clear();

    String res = dupSubUtil(root);
    if (res.compareTo("") == 0) return true; else return false;
  }

  public static String dupSubUtil(Node root) {
    String s = "";

    if (root == null) return s + MARKER;

    String lStr = dupSubUtil(root.left);
    if (lStr.compareTo(s) == 0) return s;

    String rStr = dupSubUtil(root.right);
    if (rStr.compareTo(s) == 0) return s;

    s = s + root.data + lStr + rStr;

    if (s.length() > 3 && subtrees.contains(s) == true) return "";

    subtrees.add(s);

    return s;
  }
}
