'''Given two sequences, find the length of longest subsequence present in both of them. 
Both the strings are of uppercase.'''

def lcs(m,n,X,Y):
    '''
    :param m: length of string X 
    :param n: length of string Y
    :param X: string X
    :param Y: string Y
    :return: Integer
    '''
    # code here
    L = [[None]*(n+1) for i in range(m+1)]
    
    for i in range(m+1):
        for j in range(n+1):
            if(i==0 or j==0):
                L[i][j] = 0
            elif X[i-1]==Y[j-1]:
                L[i][j] = L[i-1][j-1] + 1
            else:
                L[i][j] = max(L[i][j-1],L[i-1][j])
    return L[m][n]  