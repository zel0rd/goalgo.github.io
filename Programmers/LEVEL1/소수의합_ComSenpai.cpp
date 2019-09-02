/* 
에라토스테네스의 체의 법칙을 사용.

*/

#include <vector>
using namespace std;
 
long long solution(int N) {
    long long answer = 0;
    vector<bool> eratos(N+1);
    
    for(int i=2;i<=N;i++)
    {
        if(!eratos[i]){        //값이 false면 answer에 더하고
            answer +=i;
        }
        
        for(int j=i;j<=N;j+=i){    //그 값에 배수를 모두 true로 바꿔준다.
            eratos[j] = true;
        }
    }
    return answer;
}