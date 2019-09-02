using namespace std;

bool isPrimeNumber(int num){
    for(int i=2; i < num; i++)
        if(num % i == 0)
            return false;
    return true;
}

int solution(int n) {
    int sum = 1 ;
    for (int i = 3; i <= n; i= i+2){
        if(isPrimeNumber(i))
            sum++;
    }
    return sum;
}
