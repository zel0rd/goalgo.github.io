class Solution {
        public static int solution(String skill, String[] skillTrees) {
        int answer = 0;
        for (String skillTree : skillTrees) {
            if (checkSkillTree(skill, skillTree)) {
                answer++;
            }
        }
        return answer;
    }

    public static boolean checkSkillTree(String skill, String skillTree) {
        boolean result = false;

        char[] c = new char[skill.length()];
        int [] c_index = new int[skill.length()];
        int notExistNum = skillTree.length();
        boolean breakFlag = false;
        for(int i = 0; i <skill.length();i++){
            c[i] = skill.charAt(i);
        }

        for(int i = 0; i<c.length; i++){
            breakFlag = false;
            for(int j = 0; j<skillTree.length();j++){
                if(c[i]==skillTree.charAt(j)){
                    c_index[i] = j;
                    breakFlag = true;
                    break;
                }
            }
            if(!breakFlag) {
                c_index[i] = notExistNum;
                notExistNum++;
            }
        }
        for(int i = 0; i<c_index.length-1; i++){
            if(c_index[i]>c_index[i+1]){
                result = false;
                return result;
            }
        }
        result = true;
        return result;
    }
}
