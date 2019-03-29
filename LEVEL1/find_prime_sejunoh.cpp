#include <iostream>
using namespace std;

long long solution(int N) {
    long long answer = 0;
    
    
   //bool* prime = new bool[N+1];
    bool prime[10000001] = {false, };
    for(int i=2;i<=N;i++){
        if(prime[i]==false) answer+=i;
        for(int j=i;j<=N;j+=i){
            prime[j]=true;
        }
    }
    return answer;
}