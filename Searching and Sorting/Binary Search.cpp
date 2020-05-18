int bin_search(int A[], int left, int right, int k)
{

  while(left<=right) {
    int mid = left + ( right - left ) / 2;

    if(A[mid]==k)
    return mid;

    if(A[mid]<k)
    left = mid + 1;

    else
    right = mid - 1;
  }
  return -1;
}
