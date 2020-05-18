void toh(int n,int from,int to,int aux,long long &moves) {

    if(n==1) {
        moves++;
        cout<<"Move disk 1 from rod "<<from<<" to rod "<<to<<endl;
        return;
    }

    toh(n-1,from,aux,to,moves);
    moves++;
    toh(n-1,aux,to,from,moves);
}