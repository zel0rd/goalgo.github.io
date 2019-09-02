function solution(n) {
    const numbers = new Array(n+1);
  
    let answer = 0;
    for(let i = 2; i <= n; i++) {
      if(numbers[i] === undefined) {
        answer+=1;
        for(let j = i; j <= n; j += i) {
          numbers[j] = false;
        }
      }
    }
    return answer;
  }
