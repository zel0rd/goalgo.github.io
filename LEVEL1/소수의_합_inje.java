// 소수의 합 (Sum of Prime Numbers)
//2부터 N까지의 모든 소수의 합을 구하세요.
//N이 7이라면 {2,3,5,7} = 17 을 출력 하시면 됩니다.
//N의 범위는 2 이상 10,000,0000 이하입니다.
//효율성 테스트의 모든 시간 제한은 1초입니다.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        System.out.println(solution(scanner.nextInt()));
    }

    static String solution(int n) {
        String answer = "";
        List<Integer> list = new ArrayList<>();
        int total = 0;
        boolean breakFlag = false;

        list.add(2);
        total = total + 2;

        for(int i = 3; i<=n ; i++){
            breakFlag = false;
            for(int num : list){
                if(i % num == 0){
                    breakFlag = true;
                    break;
                }
            }
            if(!breakFlag){
                list.add(i);
                total = total + i;
            }
        }

        answer = list + "=" + total;
        return answer;
    }
}
