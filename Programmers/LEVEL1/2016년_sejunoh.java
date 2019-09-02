class Solution {
  public String solution(int a, int b) {
      String answer = "";
      String mon ="MON";
      String tue ="TUE";
      String wed ="WED";
      String thu ="THU";
      String fri ="FRI";
      String sat ="SAT";
      String sun ="SUN";

      int[] month = {0,31,29,31,30,31,30,31,31,30,31,30};
      int day=0;
      for(int i = 0; i<a; i++){
          day += month[i];
      }
      day = (day+b)%7;
      switch(day){
          case 1:
              answer = fri;
              break;
          case 2:
              answer = sat;
              break;
          case 3:
              answer = sun;
              break;
         case 4:
              answer = mon;
              break;       
        case 5:
              answer = tue;
              break;       
        case 6:
              answer = wed;
              break;      
        case 0:
              answer = thu;
              break; 
      }
      return answer;
  }
}