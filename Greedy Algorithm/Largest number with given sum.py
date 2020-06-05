'''A boy lost the password of his super locker.
He remembers the number of digits N as well as the sum S of all the digits of his password. 
He know that his password is the largest number of N digits that can be possible with given sum S. 
As he is busy doing his homework, help him retrieving his password.'''

def largestNum(m,s):
    '''
    :param m: length of given numberr
    :param s: sum of digits of number
    :return: Integer
    '''
    # code here
    if(s==0):
        if(m==1):
            return 0
        else:
            return -1
    if(s>9*m):
        return -1
    result = [0] * m
    for i in range(0,m):
        if(s>=9):
            result[i] = 9
            s -= 9
        else:
            result[i] = s
            s = 0;
    answer = 0        
    for x in result:
        answer += x;
        answer *= 10;
    return answer//10
    
 