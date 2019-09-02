class Solution {
  public int solution(int n) {
      int answer = 0;
      int a = 2; int b= 3;
      if(n<4) return n;
      for(int i =4; i<=n; i++){
          answer = (a+b)%1000000007;
          a = b;
          b = answer ;
      }
      return answer;
  }
}