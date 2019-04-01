import java.util.Arrays;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i=0; i<commands.length;i++){
            int k = commands[i][0]-1;
            int[] temp = new int[commands[i][1]-commands[i][0]+1];

            // copyOfRange
            for(int j=0; k<commands[i][1];j++){
            temp[j] = array[k];
            k++;
            if(k==commands[i][1]){
                Arrays.sort(temp);
                answer[i] = temp[commands[i][2]-1];
                break;
                }
           }
        }
        return answer;
    }
}