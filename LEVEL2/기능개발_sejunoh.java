import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
       Queue<Integer> temp = new ConcurrentLinkedQueue<Integer>();
        for(int i=0;i<progresses.length;i++){
             if((100-progresses[i])%speeds[i]==0){
                 temp.add((100-progresses[i])/speeds[i]);
             }
            else {
                temp.add((100-progresses[i])/speeds[i]+1);
            }
        }
        List <Integer> result = new ArrayList<Integer>();
        int i = temp.poll();
        int count =1;
        while(!temp.isEmpty()){
            int j = temp.poll();
            if(i>=j){
                count++;
            } else {
                result.add(count);
                count =1;
                i = j;
            }
        }
        result.add(count);
        int[] answer = new int[result.size()];
        for(int k=0; k< answer.length;k++){
            answer[k]=result.get(k);
        }
        return answer;
    }
}