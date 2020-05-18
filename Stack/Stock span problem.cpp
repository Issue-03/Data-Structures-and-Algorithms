void stockSpan(int prices[], int n, int span[]) {

    stack<int> index;
    index.push(0);
    span[0] = 1;

    for(int  i=1;i<n;i++) {

        while(!index.empty() && prices[index.top()]<=prices[i]) 
        index.pop();

        span[i] = index.empty() ? i+1 : i - index.top();

        index.push(i);
    }
}