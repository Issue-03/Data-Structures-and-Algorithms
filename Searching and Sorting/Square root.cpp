// Given an integer x. The task is to find the square root of x. If x is not a perfect square, then return floor(√x).

long long int floorSqrt(long long int x)
{
  if(x==0||x==1)
  return x;

  long long int start = 1, end = x/2, ans;
  while(start<=end) {
    long long int mid = (start + end) / 2;

    if(mid * mid == x )
    return mid;

    if(mid * mid < x) {
      start = mid + 1;
      ans = mid;
    }
    else {
      end = mid - 1;
    }
  }
  return ans;
}
