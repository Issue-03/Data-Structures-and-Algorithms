// Given an array A and an integer K. Find the maximum for each and every contiguous subarray of size K.

// Example:
// Input:
// 2
// 9 3
// 1 2 3 1 4 5 2 3 6
// 10 4
// 8 5 10 7 9 4 15 12 90 13
// Output:
// 3 3 4 5 5 5 6
// 10 10 10 15 15 90 90

class solve {

  static ArrayList<Integer> max_of_subarrays(int arr[], int n, int k) {
    ArrayList<Integer> maximums = new ArrayList<Integer>();

    Deque<Integer> dq = new LinkedList<Integer>();

    int i;
    for (i = 0; i < k; ++i) {
      while (!dq.isEmpty() && arr[i] >= arr[dq.peekLast()]) dq.removeLast();

      dq.addLast(i);
    }

    for (; i < n; ++i) {
      maximums.add(arr[dq.peek()]);
      while (!dq.isEmpty() && dq.peek() <= i - k) dq.removeFirst();

      while (!dq.isEmpty() && arr[i] >= arr[dq.peekLast()]) dq.removeLast();

      dq.addLast(i);
    }
    maximums.add(arr[dq.peek()]);

    return maximums;
  }
}
