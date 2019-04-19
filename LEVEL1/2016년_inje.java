public class _2016년 {
    public static String solution(int a, int b) {
        String answer = "";
        int[] month = {31,29,31,30,31,30,31,31,30,31,30,31};
        String[] day = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
        
        int totalDate = 0;
        for(int i = 0; i<a-1; i++){
            totalDate = totalDate + month[i];
        }
        totalDate = totalDate + b;

        answer = day[(totalDate-1)%7];

        System.out.println(answer);
        return answer;
    }
}
