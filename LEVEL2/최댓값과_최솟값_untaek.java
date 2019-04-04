import java.util.Arrays;

public class Solution {
    public String solution(String str) {
      	String s[] = (str.split(" "));
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
      	for(String i: s) {
          int num = Integer.parseInt(i);
        	if (max > num) max = num;
          if (min < num) min = num;
        }
        return String.format("%d %d", max, min);
    }
}