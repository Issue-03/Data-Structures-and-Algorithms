class StackQueue {
  Stack<Integer> s1 = new Stack<Integer>();
  Stack<Integer> s2 = new Stack<Integer>();

  /* The method insert to push element
       into the queue */
  void Push(int x) {
    s1.push(x);
  }

  /* The method remove which return the
      element popped out of the queue*/
  int Pop() {
    if (s1.isEmpty()) return -1;

    while (!s1.isEmpty()) {
      int x = s1.pop();
      s2.push(x);
    }
    int result = s2.pop();
    while (!s2.isEmpty()) {
      int x = s2.pop();
      s1.push(x);
    }

    return result;
  }
}
