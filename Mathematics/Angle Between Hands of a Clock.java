// Given two numbers, hour and minutes. Return the smaller angle (in degrees)
// formed between the hour and the minute hand.
// Input: hour = 12, minutes = 30
// Output: 165
// Input: hour = 3, minutes = 30
// Output: 75

// Constraints:

// 1 <= hour <= 12
// 0 <= minutes <= 59
// Answers within 10^-5 of the actual value will be accepted as correct.

class Solution {

  double angleClock(int h, int m) {
    double hour_angle = (double) (0.5) * (h * 60 + m);
    double min_angle = (double) (6 * m);

    double angle = Math.abs(hour_angle - min_angle);

    angle = Math.min(360 - angle, angle);

    return angle;
  }
}
