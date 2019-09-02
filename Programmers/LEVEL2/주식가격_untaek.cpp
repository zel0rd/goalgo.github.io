#include <string>
#include <vector>

using namespace std;

vector<int> solution(vector<int> prices) {
    int N = prices.size();
    
    vector<int> answer(N);
    
    for(int i=0; i<N; i++) {
        int maintain = 0;
        for(int j=i; j<N; j++) {
            if(prices[i] <= prices[j]){
                if(j != N-1) maintain++;
            }
            else break;
        }
        answer[i] = maintain;
    }
    
    return answer;
}