function solution(a, b) {
    var result = (a<b)?a:b; //a가 더 크다면 result == b

    while(a!=b){ //a와 b가 같아질 때 까지 반복한다
      result += (a<b)?++a:++b;
    }    

    return result;
}