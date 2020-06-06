'''Given a set of numbers, check whether it can be partitioned 
into two subsets such that the sum of elements in both subsets is same or not.'''

def findPartition(arr,n):
    
    #return True or False
    
    total = sum(arr)
    if(total%2 != 0):
        return False
    part = [[ True for i in range(n + 1)]  for j in range(total // 2 + 1)]
    
    for i in range(0,n+1):
        part[0][i] = True
    for i in range(1,total//2 + 1):
        part[i][0] = False
    for i in range(1, total // 2 + 1): 
        for j in range(1, n + 1): 
            part[i][j] = part[i][j - 1] 
            if i >= arr[j - 1]: 
                part[i][j] = (part[i][j] or part[i - arr[j - 1]][j - 1]) 
    return part[total // 2][n] 