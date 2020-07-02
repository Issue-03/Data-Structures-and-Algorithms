// You are given an array coordinates, coordinates[i] = [x, y], where [x, y] represents the coordinate of a point.
// Check if these points make a straight line in the XY plane.
// Input: coordinates = [[1,2],[2,3],[3,4],[4,5],[5,6],[6,7]]
// Output: true

class Solution {

  public boolean checkStraightLine(int[][] coordinates) {
    if (coordinates.length <= 2) return true;
    for (int i = 2; i < coordinates.length; i++) {
      int x1 = coordinates[i - 2][0];
      int x2 = coordinates[i - 1][0];
      int x3 = coordinates[i][0];
      int y1 = coordinates[i - 2][1];
      int y2 = coordinates[i - 1][1];
      int y3 = coordinates[i][1];

      if ((y2 - y1) * (x3 - x2) != (x2 - x1) * (y3 - y2)) return false;
    }
    return true;
  }
}
