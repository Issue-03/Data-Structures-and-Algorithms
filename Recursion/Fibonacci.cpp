long long fibonacci(int N) {

    if(N<=1)
    return N;

    return (fibonacci(N-1) + fibonacci(N-2));
}