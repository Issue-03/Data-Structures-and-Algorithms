// Given a number N, print the first N fibonacci numbers.

void printFibb(int n) {
    long long int fib[n];
    fib[0] = 1;
    fib[1] = 1;
    for(int i=2;i<n;i++) {
        fib[i] = fib[i-1] + fib[i-2];
    }
    for(int i=0;i<n;i++)
    cout<<fib[i]<<" ";
}