// 쇠막대기
public class Problem5 {
    public static int solution(String arrangement) {
        int answer = 0;
        int stack = 0;

        arrangement = arrangement.replace("()","*");

        for(int i = 0; i<arrangement.length()-1; i++){
            if(arrangement.charAt(i) == '('){
                stack++;
                answer++;
            }else if(arrangement.charAt(i) == '*'){
                answer = answer + stack;
            }else{  //arrangement.charAt(i) == ')'
                stack--;
            }
        }
        return answer;
    }
}
