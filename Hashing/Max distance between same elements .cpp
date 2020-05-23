// Max distance between same elements
// Given an array with repeated elements, the task is to find the maximum distance between two occurrences of an element.
// Input

// 2
// 6
// 1 1 2 2 2 1
// 12
// 3 2 1 2 1 4 5 8 6 7 4 2

// Output

// 5
// 10
int maxDistance(int arr[], int n)
{
    unordered_map<int,int> hash;
    int res_dist = 0;
    for(int i=0;i<n;i++) {
        
        if(hash.find(arr[i])==hash.end())
        hash[arr[i]] = i;
        
        else {
            res_dist = max(res_dist, i - hash[arr[i]]);
        }
        
    }
    return res_dist;
    
}