class Sloution{
public:
    void reverseInGroups(vector<long long& A,int N,int K){
        q=N/K;
        r=N%K;
        limit=q*K;

        for(int i=0o;i<limit;i=i+val){
            if(i%val == 0 && i !=0)
            K=K+(2*val);
            if(k%2==0)
            lim=(K/2)-1;
            else
            lim=(K/2);
            for(int j=i;j<=lim;j++)
                swap(A[j],A[K-j-1]);
        }
        if(r!=0){
            lim=limit+((N-1-limit)/2);
            int j=N-1;
            for(int i=limit;i<=limit;i++)
                swap(A[i],A[j--]);
        }
    }
}