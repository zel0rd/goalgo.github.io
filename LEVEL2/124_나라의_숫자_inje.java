public static String solution(int n) {
        String answer = "";
        int a = 1;  // + b * 3
        int b = 1;  // * 3

        while (n >= a) {
            if (((n - a) / b) % 3 == 0) {
                answer = String.valueOf(1) + answer;
            } else if (((n - a) / b) % 3 == 1) {
                answer = String.valueOf(2) + answer;
            } else {
                answer = String.valueOf(4) + answer;
            }
            a = a + b * 3;
            b = b * 3;
        }
        System.out.println(" result : " + answer);
        return answer;
    }
