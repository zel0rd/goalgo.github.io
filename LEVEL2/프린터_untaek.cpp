#include <string>
#include <vector>
#include <queue>

using namespace std;

int solution(vector<int> priorities, int location) {
    int answer = 0;
    int N = priorities.size();
    vector<bool> printed(N);
    queue<int> q;
    priority_queue<int> pq;
    
    for(int i=0; i<N; i++) {
        q.push(i);
        pq.push(priorities[i]);
    }
    
    while(!printed[location]) {
        if(priorities[q.front()] == pq.top()) {
            printed[q.front()] = true;
            answer++;
            q.pop();
            pq.pop();
        }
        else {
            q.push(q.front());
            q.pop();
        }
    }
    
    return answer;
}