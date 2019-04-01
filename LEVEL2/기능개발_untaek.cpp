#include <string>
#include <vector>

using namespace std;

vector<int> solution(vector<int> progresses, vector<int> speeds) {
    vector<int> answer(1, 1);
    int N = progresses.size();
    int done = 0;
    int dist = 0;

    for(int i=0; i<N-1; i++) {
        int cur = (99 - progresses[i]) / speeds[i] + 1;
        int next = (99 - progresses[i+1]) / speeds[i+1] + 1;
        
        if(cur >= next) {
            answer.back()++;
        }
        else {
            answer.push_back(1);
        }
    }
    
    return answer;
}