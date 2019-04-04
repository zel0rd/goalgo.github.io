class Solution {
  public String solution(int n) {
      String answer = "";
      int k= n-1;
      while(k>=0){
         if(k%3==2){
              answer = "4".concat(answer);
          }
          if(k%3==1){
              answer = "2".concat(answer);
          }
          if(k%3==0){
              answer = "1".concat(answer);
          }
          k = k/3 -1;
      }
      return answer;
  }
}