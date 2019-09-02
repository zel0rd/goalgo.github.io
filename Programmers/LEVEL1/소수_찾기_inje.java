import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(solution(scanner.nextInt()));
    }

    static int solution(int n) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        boolean breakFlag = false;

        list.add(2);
        for (int i = 3; i <= n; i++) {
            breakFlag = false;
            for (int num : list) {
                if (i % num == 0) {
                    breakFlag = true;
                    break;
                }
            }
            if (!breakFlag) {
                list.add(i);
            }
        }
        return list.size();
    }
}
