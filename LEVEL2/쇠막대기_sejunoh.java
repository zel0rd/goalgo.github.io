import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
class Solution {
    public int solution(String arrangement) {
        int answer = 0;
        int level = 0;
        int count = 0;
        String replace = arrangement.replace("()","0");
        List<String> arr = new ArrayList<String>(Arrays.asList(replace.split("")));
        for(int i=0; i<arr.size();i++){
            if(arr.get(i).equals("(")) {
                count++;
                level++;
            }
            if(arr.get(i).equals(")")){
                level--;
            }
            if(arr.get(i).equals("0")) {
                count += level; 
            }
        }
        return count;
    }
}