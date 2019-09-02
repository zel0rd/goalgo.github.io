//효율성 테스트 통과하지 못함. 조만간 공부해서 수정할 예정입니다..

using namespace std;

bool isPrimeNumber(int num){
    for(int i=2; i < num; i++)
        if(num % i == 0)
            return false;
    return true;
}

long long solution(int N) {
    long long sum = 2;
    for (int i = 3; i <= N; i=i+2){
        if(isPrimeNumber(i))
            sum += i;
    }
    return sum;
}
