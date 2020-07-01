// Given n non-negative integers representing the histogram's bar height where the width of each bar is 1, 
// // find the area of largest rectangle in the histogram.
// Example:

// Input: [2,1,5,6,2,3]
// Output: 10
class Solution {

  public int largestRectangleArea(int[] heights) {
    Stack<Integer> ind = new Stack<Integer>();

    int top = 0;
    int max_area = 0;
    int area_with_top = 0;

    int i = 0;
    while (i < heights.length) {
      if (ind.isEmpty() || heights[ind.peek()] <= heights[i]) ind.push(
        i++
      ); else {
        top = ind.peek();
        ind.pop();
        area_with_top = heights[top] * (ind.isEmpty() ? i : i - ind.peek() - 1);
        if (max_area < area_with_top) max_area = area_with_top;
      }
    }
    while (ind.isEmpty() == false) {
      top = ind.peek();
      ind.pop();
      area_with_top = heights[top] * (ind.isEmpty() ? i : i - ind.peek() - 1);
      if (max_area < area_with_top) max_area = area_with_top;
    }
    return max_area;
  }
}
