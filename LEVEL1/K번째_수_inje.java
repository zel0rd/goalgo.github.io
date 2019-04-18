import java.util.Arrays;

public class K번째_수 {
    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int[] array_after;
        
        for(int i = 0; i<commands.length; i++){
        
            //array_after 초기화
            array_after = new int[commands[i][1]-commands[i][0]+1];
            for(int j = 0; j < array_after.length; j++){
                array_after[j] = array[commands[i][0]-1+j];
            }
            
            //array_after 정렬
            Arrays.sort(array_after);
            
            //answer 값 입력
            answer[i] = array_after[commands[i][2]-1];
        }
        return answer;
    }

}
