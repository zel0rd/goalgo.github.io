import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.Arrays;
class Solution {
    class Print{
        int seq;
        int pri;
        public Print(int i, int v){
            seq = i;
            pri = v;
        }        
    }
    public int solution(int[] priorities, int location) {
        int answer = 1;
        
        Queue<Print> waiting = new ConcurrentLinkedQueue<Print>();
        Queue<Print> printed = new ConcurrentLinkedQueue<Print>();
        
        for(int i=0; i< priorities.length; i++){
            waiting.add(new Print(i, priorities[i]));
        }
        Arrays.sort(priorities);
        for(int i=priorities.length-1; i>-1; i--){
            while(waiting.peek().pri!=priorities[i]){
                waiting.add(waiting.poll());
            }
            printed.add(waiting.poll());
        }
        while(printed.poll().seq!=location){
            answer++;
        }
        return answer;
    }
}