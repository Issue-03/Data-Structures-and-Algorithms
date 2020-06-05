'''Given weights and values of N items, we need to put these items in a knapsack of capacity W 
to get the maximum total value in the knapsack.
Note: Unlike 0/1 knapsack, you are allowed to bread the item.'''

def compare(item):
    return item.value/item.weight
def fractionalknapsack(W,Items,n):
    '''
    :param W: max weight which can be stored
    :param Items: List contianing Item class objects as defined in driver code, with value and weight
    :param n: size of Items
    :return: Float value of max possible value, two decimal place accuracy is expected by driver code
    
    {
        class Item:
        def __init__(self,val,w):
            self.value = val
            self.weight = w
    }
    '''
    # code here
    result = 0
    Items.sort(key=compare,reverse=True)
    for x in Items:
        wt = x.weight
        val = x.value
        if(W - wt) >=0:
            W -= wt
            result += val 
        else:
            fraction = W / wt
            result += val * fraction
            W = W - (wt * fraction)
            break
    return result    

