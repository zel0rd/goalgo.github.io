#include <string>
#include <vector>

using namespace std;

long long solution(int a, int b) {
    long long answer = 0;
    
    //a가 b보다 더 큰 수인지를 검사
    if(a>b) { 
        int temp = a;
        a = b;
        b = temp;
    }
        
    //a부터 b까지 모두 더한다
    while(a<=b) {
        answer += a;
        a++;
    }
    return answer;
}