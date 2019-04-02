/**
 * 더 맵게
 * https://programmers.co.kr/learn/courses/30/lessons/42626
 */

#include <string>
#include <vector>
#include <queue>

using namespace std;

int solution(vector<int> scoville, int K) {
    int mix = 0;
    priority_queue< int, vector<int>, greater<int> > pq;
    
    for(int i=0; i< scoville.size(); i++) {
        pq.push(scoville[i]);
    }
    
    for(int i=0; i<scoville.size(); i++) {  
        if(pq.top() >= K) {
            return mix;
        }
        
        if(pq.size() > 1){
            int first = pq.top(); pq.pop();
            int second = pq.top(); pq.pop();
            pq.push(first + second * 2);
            mix++;
        }
    }
    
    return -1;
}