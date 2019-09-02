import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        List<String> skills = new ArrayList <String>(Arrays.asList(skill.split(""))); 
        for(int i=0; i<skill_trees.length; i++){
            List<Integer> temp = new ArrayList<Integer>();
            List<String> myskills = new ArrayList <String>(Arrays.asList(skill_trees[i].split("")));    
            for(int j=0;j<myskills.size();j++){
                if(skills.contains(myskills.get(j))){
                    temp.add(skills.indexOf(myskills.get(j)));
                }
            }
            if(temp.isEmpty()) {
                answer++;
                continue;
            }
            if(temp.get(0)!=0) continue;
            for(int j=0;j<temp.size();j++){
                if(temp.get(j+1)-temp.get(j) != 1) break;
                if(temp.get(j)+1==temp.get(j+1)&& j+1==temp.size()) {
                    answer++;
                    break;
                }
            }
        }
        return answer;
    }
}


