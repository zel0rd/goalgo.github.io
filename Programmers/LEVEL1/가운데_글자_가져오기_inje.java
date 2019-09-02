import java.util.Scanner;

public class Main {
    static Scanner scanner;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        System.out.println(solution(scanner.next()));
    }

    static String solution(String s){
        String answer = "";
        if(s.length() %2 == 0){ //짝수면
            answer =  s.substring(s.length()/2-1,s.length()/2+1);
        }else{
            answer = s.substring(s.length()/2,s.length()/2+1);
        }

        return answer;
    }
}
