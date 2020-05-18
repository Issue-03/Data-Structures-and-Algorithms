int counter = 2;

bool isLucky(int n) {

    if(counter>n)
    return true;
    if(n%counter==0)
    return false;
    
    n -= n/counter;
    counter++;
    return isLucky(n);
    
}