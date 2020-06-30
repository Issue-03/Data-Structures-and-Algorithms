//Given a Two Binary Trees, write a function thaTemp returns true if one is mirror of other, else returns false.
class Tree {

  boolean areMirror(Node a, Node b) {
    Queue<Node> aQ = new LinkedList<Node>();
    Queue<Node> bQ = new LinkedList<Node>();
    aQ.add(a);
    bQ.add(b);
    while (!aQ.isEmpty() || !bQ.isEmpty()) {
      Node aTemp = aQ.poll();
      Node bt = bQ.poll();
      if (aTemp.data != bt.data) return false;
      if (aTemp.left != null) aQ.add(aTemp.left);
      if (aTemp.right != null) aQ.add(aTemp.right);
      if (bt.right != null) bQ.add(bt.right);
      if (bt.left != null) bQ.add(bt.left);
    }
    if (!aQ.isEmpty() || !bQ.isEmpty()) return false; else return true;
  }
}
