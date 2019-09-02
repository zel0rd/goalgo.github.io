public static String solution(int n) {
        String answer = "";
        int a = 1;  // + b * 3
        int b = 1;  // * 3

        while (n >= a) {
            if (((n - a) / b) % 3 == 0) {
                answer = 1 + answer;
            } else if (((n - a) / b) % 3 == 1) {
                answer = 2 + answer;
            } else {
                answer = 4 + answer;
            }
            b = b * 3;
            a = a + b;
        }
        System.out.println(" result : " + answer);
        return answer;
    }
