#include <string>
#include <vector>

using namespace std;

string solution(int n) {
    string answer = "";
    int m = n;
    
    while(m > 0) {
        switch(m % 3) {
            case 0: answer.insert(0, "4"); break;
            case 1: answer.insert(0, "1"); break;
            case 2: answer.insert(0, "2"); break;
        }
        m = (m - 1) / 3;
    }
    
    return answer;
}