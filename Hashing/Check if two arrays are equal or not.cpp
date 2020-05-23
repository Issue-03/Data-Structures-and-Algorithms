// Check if two arrays are equal or not
// Given two arrays A and B of equal size N, the task is to find if given arrays are equal or not. Two arrays are said to be equal if both of them contain same set of elements, arrangements (or permutation) of elements may be different though.
// Note : If there are repetitions, then counts of repeated elements must also be same for two array to be equal

bool check(vector<ll> arr, vector<ll> brr, int n) {

    unordered_map<ll,ll> hash;
    for(int i=0;i<n;i++)
    hash[arr[i]]++;
    
    for(int i=0;i<n;i++) {
        
        if(hash.find(brr[i])==hash.end())
        return false;
        
        if(hash[brr[i]]==0)
        return false;
        
        hash[brr[i]]--;
    }
    return true;
    
}