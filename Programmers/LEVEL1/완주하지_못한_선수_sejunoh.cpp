#include <string>
#include <vector>
#include <algorithm>

using namespace std;

string solution(vector<string> participant, vector<string> completion) {
    sort(participant.begin(),participant.end());
    sort(completion.begin(),completion.end());
    
    string answer;
    for(int i =0; i < participant.size()-1;i++){
        if(participant[i]!=completion[i]){
            return answer = participant[i];
        }
    }
    return answer =participant.back();
}