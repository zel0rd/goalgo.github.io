class Solution {
  public String solution(String[] seoul) {
    for(int i=0; i< seoul.length ;i++){
        if(seoul[i].equals("Kim")){
            String index = Integer.toString(i);
            return "김서방은 " + index + "에 있다";
        }
    }
      return "에러";
  }
}
