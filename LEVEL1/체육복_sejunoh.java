class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int i=0;
        int j= 0;
        while(i<lost.length && j<reserve.length){
            if(lost[i]-reserve[j] >=2) {
                j++; 
                continue;
            }
            if(lost[i]-reserve[j] <=-2) {
                i++; 
                continue;
            }
            if((lost[i]-reserve[j])*(lost[i]-reserve[j]) <=1) {
                i++;
                j++;
                answer++; 
                continue;
            }
        }
        i = lost.length;
        answer =  n-i+answer;
        return answer;
    }
}
