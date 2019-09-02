#include <string>
#include <vector>
#include <algorithm>

using namespace std;

string solution(vector<string> seoul) {

    string answer = "";

    answer = "김서방은 "+
    to_string(distance(seoul.begin(),find(seoul.begin(),seoul.end(),"Kim"))) + 
    "에 있다";
    //to_string(find(seoul.begin(),seoul.end(),"Kim") - seoul.begin())

    return answer;
}