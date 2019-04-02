public class 다리를_지나는_  {
    public static int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int total;

        // array 초기화
        int[] array = new int[truck_weights.length + bridge_length];
        for (int i = 0; i < bridge_length; i++) {
            array[i] = 0;
        }
        for (int i = bridge_length; i < array.length; i++) {
            array[i] = truck_weights[i - bridge_length];
        }
        
        // answer 구하기
        for (; true; ) {
            total = 0;

            // 1부터 length 까지의 무게를 더하기.
            for (int i = 1; i <= bridge_length; i++) {
                total += array[i];
            }
            // total 과 answer 비교
            if (total > weight) {   //  >> 0~ bridge_length-2 까지만 이동
                for (int i = 0; i < bridge_length - 1; i++) {
                    array[i] = array[i + 1];
                }
                array[bridge_length - 1] = 0;
            } else {                //  >> 전체 이동
                for (int i = 0; i < array.length - 1; i++) {
                    array[i] = array[i + 1];
                }
                array[array.length-1] = -1;
            }
            answer++;
            if(array[0] == -1){
                break;
            }
        }
        return answer;
    }
}
