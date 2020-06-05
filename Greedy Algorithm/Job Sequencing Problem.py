'''Given a set of N jobs where each job i has a deadline and profit associated to it. 
Each job takes 1 unit of time to complete and only one job can be scheduled at a time. 
We earn the profit if and only if the job is completed by its deadline. 
The task is to find the maximum profit and the number of jobs done.'''

def compare(job):
    return job.profit
def maxProfit(Jobs,n):
    '''
    :param Jobs: list of "Job" class defined in driver code, with "profit" and "deadline".
    :param n: total number of jobs
    :return: None, print the count of jobs done and maximum profit
    '''
    '''
    {
        class Job:.
        def __init__(self,profit=0,deadline=0):
            self.profit = profit
            self.deadline = deadline
            self.id = 0
    }
    '''
    # code here
    Jobs.sort(key=compare,reverse=True)
    result = [0] * n
    filled = [False] * n
    for x in range(n):
        y = min(n,Jobs[x].deadline) - 1
        while(y>=0):
            if(filled[y]==False):
                result[y] = x
                filled[y] = True
                break
            y -= 1
    count = 0
    max_profit = 0
    for i in range(n):
        if(filled[i]):
            count += 1
            max_profit += Jobs[result[i]].profit
    print(count,max_profit,sep=" ");        
