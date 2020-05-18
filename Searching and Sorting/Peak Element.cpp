int peakElement(int arr[], int n)
{
  int l = 0, r = n -1 ;

  while(l<=r) {
    int mid = l + (r-l) / 2;

    if((mid==0||arr[mid-1]<=arr[mid]) && (mid==n-1||arr[mid+1]<=arr[mid]))
    return mid;

    else if(mid>0 && arr[mid-1]>arr[mid])
    r = mid - 1;

    else
    l = mid + 1;
  }

}
