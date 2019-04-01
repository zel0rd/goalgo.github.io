function solution(a, b) {
    var result = (a<b)?a:b;
    while(a!=b){
      result += (a<b)?++a:++b;
    }    
    return result;
}